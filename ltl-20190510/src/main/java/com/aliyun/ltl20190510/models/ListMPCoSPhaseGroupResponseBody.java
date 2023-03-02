// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class ListMPCoSPhaseGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListMPCoSPhaseGroupResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListMPCoSPhaseGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMPCoSPhaseGroupResponseBody self = new ListMPCoSPhaseGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMPCoSPhaseGroupResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListMPCoSPhaseGroupResponseBody setData(ListMPCoSPhaseGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMPCoSPhaseGroupResponseBodyData getData() {
        return this.data;
    }

    public ListMPCoSPhaseGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMPCoSPhaseGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMPCoSPhaseGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListMPCoSPhaseGroupResponseBodyDataPageData extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("PhaseGroupId")
        public String phaseGroupId;

        @NameInMap("Remark")
        public String remark;

        public static ListMPCoSPhaseGroupResponseBodyDataPageData build(java.util.Map<String, ?> map) throws Exception {
            ListMPCoSPhaseGroupResponseBodyDataPageData self = new ListMPCoSPhaseGroupResponseBodyDataPageData();
            return TeaModel.build(map, self);
        }

        public ListMPCoSPhaseGroupResponseBodyDataPageData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMPCoSPhaseGroupResponseBodyDataPageData setPhaseGroupId(String phaseGroupId) {
            this.phaseGroupId = phaseGroupId;
            return this;
        }
        public String getPhaseGroupId() {
            return this.phaseGroupId;
        }

        public ListMPCoSPhaseGroupResponseBodyDataPageData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

    }

    public static class ListMPCoSPhaseGroupResponseBodyData extends TeaModel {
        @NameInMap("Num")
        public Integer num;

        @NameInMap("PageData")
        public java.util.List<ListMPCoSPhaseGroupResponseBodyDataPageData> pageData;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("Total")
        public Integer total;

        public static ListMPCoSPhaseGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMPCoSPhaseGroupResponseBodyData self = new ListMPCoSPhaseGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMPCoSPhaseGroupResponseBodyData setNum(Integer num) {
            this.num = num;
            return this;
        }
        public Integer getNum() {
            return this.num;
        }

        public ListMPCoSPhaseGroupResponseBodyData setPageData(java.util.List<ListMPCoSPhaseGroupResponseBodyDataPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<ListMPCoSPhaseGroupResponseBodyDataPageData> getPageData() {
            return this.pageData;
        }

        public ListMPCoSPhaseGroupResponseBodyData setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public ListMPCoSPhaseGroupResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
