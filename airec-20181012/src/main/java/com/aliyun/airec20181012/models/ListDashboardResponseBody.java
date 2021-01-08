// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ListDashboardResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Result")
    public ListDashboardResponseBodyResult result;

    public static ListDashboardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDashboardResponseBody self = new ListDashboardResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDashboardResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDashboardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDashboardResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDashboardResponseBody setResult(ListDashboardResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListDashboardResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListDashboardResponseBodyResultList extends TeaModel {
        @NameInMap("UvCtr")
        public Float uvCtr;

        @NameInMap("BizDate")
        public Long bizDate;

        @NameInMap("ActiveItem")
        public Long activeItem;

        @NameInMap("PerUvBhv")
        public Float perUvBhv;

        @NameInMap("Uv")
        public Long uv;

        @NameInMap("PerUvClick")
        public Float perUvClick;

        @NameInMap("Pv")
        public Long pv;

        @NameInMap("Ctr")
        public Float ctr;

        @NameInMap("SceneId")
        public String sceneId;

        @NameInMap("TraceId")
        public String traceId;

        @NameInMap("Click")
        public Long click;

        @NameInMap("ClickUser")
        public Long clickUser;

        public static ListDashboardResponseBodyResultList build(java.util.Map<String, ?> map) throws Exception {
            ListDashboardResponseBodyResultList self = new ListDashboardResponseBodyResultList();
            return TeaModel.build(map, self);
        }

        public ListDashboardResponseBodyResultList setUvCtr(Float uvCtr) {
            this.uvCtr = uvCtr;
            return this;
        }
        public Float getUvCtr() {
            return this.uvCtr;
        }

        public ListDashboardResponseBodyResultList setBizDate(Long bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public Long getBizDate() {
            return this.bizDate;
        }

        public ListDashboardResponseBodyResultList setActiveItem(Long activeItem) {
            this.activeItem = activeItem;
            return this;
        }
        public Long getActiveItem() {
            return this.activeItem;
        }

        public ListDashboardResponseBodyResultList setPerUvBhv(Float perUvBhv) {
            this.perUvBhv = perUvBhv;
            return this;
        }
        public Float getPerUvBhv() {
            return this.perUvBhv;
        }

        public ListDashboardResponseBodyResultList setUv(Long uv) {
            this.uv = uv;
            return this;
        }
        public Long getUv() {
            return this.uv;
        }

        public ListDashboardResponseBodyResultList setPerUvClick(Float perUvClick) {
            this.perUvClick = perUvClick;
            return this;
        }
        public Float getPerUvClick() {
            return this.perUvClick;
        }

        public ListDashboardResponseBodyResultList setPv(Long pv) {
            this.pv = pv;
            return this;
        }
        public Long getPv() {
            return this.pv;
        }

        public ListDashboardResponseBodyResultList setCtr(Float ctr) {
            this.ctr = ctr;
            return this;
        }
        public Float getCtr() {
            return this.ctr;
        }

        public ListDashboardResponseBodyResultList setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public ListDashboardResponseBodyResultList setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public ListDashboardResponseBodyResultList setClick(Long click) {
            this.click = click;
            return this;
        }
        public Long getClick() {
            return this.click;
        }

        public ListDashboardResponseBodyResultList setClickUser(Long clickUser) {
            this.clickUser = clickUser;
            return this;
        }
        public Long getClickUser() {
            return this.clickUser;
        }

    }

    public static class ListDashboardResponseBodyResult extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListDashboardResponseBodyResultList> list;

        @NameInMap("Num")
        public Integer num;

        public static ListDashboardResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListDashboardResponseBodyResult self = new ListDashboardResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListDashboardResponseBodyResult setList(java.util.List<ListDashboardResponseBodyResultList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListDashboardResponseBodyResultList> getList() {
            return this.list;
        }

        public ListDashboardResponseBodyResult setNum(Integer num) {
            this.num = num;
            return this;
        }
        public Integer getNum() {
            return this.num;
        }

    }

}
