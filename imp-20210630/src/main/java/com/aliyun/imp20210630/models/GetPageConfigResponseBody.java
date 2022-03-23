// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetPageConfigResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 返回结果
    @NameInMap("Result")
    public GetPageConfigResponseBodyResult result;

    public static GetPageConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPageConfigResponseBody self = new GetPageConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPageConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPageConfigResponseBody setResult(GetPageConfigResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetPageConfigResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetPageConfigResponseBodyResultAdList extends TeaModel {
        // 是否不可购买
        @NameInMap("CanNotBeenBought")
        public Boolean canNotBeenBought;

        // 页面详情
        @NameInMap("Detail")
        public String detail;

        // 页面图标
        @NameInMap("Icon")
        public String icon;

        // 跳转购买链接
        @NameInMap("JumpBuyLink")
        public String jumpBuyLink;

        // 页面子标题
        @NameInMap("SubTitle")
        public String subTitle;

        // 页面标题
        @NameInMap("Title")
        public String title;

        public static GetPageConfigResponseBodyResultAdList build(java.util.Map<String, ?> map) throws Exception {
            GetPageConfigResponseBodyResultAdList self = new GetPageConfigResponseBodyResultAdList();
            return TeaModel.build(map, self);
        }

        public GetPageConfigResponseBodyResultAdList setCanNotBeenBought(Boolean canNotBeenBought) {
            this.canNotBeenBought = canNotBeenBought;
            return this;
        }
        public Boolean getCanNotBeenBought() {
            return this.canNotBeenBought;
        }

        public GetPageConfigResponseBodyResultAdList setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public GetPageConfigResponseBodyResultAdList setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public GetPageConfigResponseBodyResultAdList setJumpBuyLink(String jumpBuyLink) {
            this.jumpBuyLink = jumpBuyLink;
            return this;
        }
        public String getJumpBuyLink() {
            return this.jumpBuyLink;
        }

        public GetPageConfigResponseBodyResultAdList setSubTitle(String subTitle) {
            this.subTitle = subTitle;
            return this;
        }
        public String getSubTitle() {
            return this.subTitle;
        }

        public GetPageConfigResponseBodyResultAdList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetPageConfigResponseBodyResult extends TeaModel {
        // 广告位列表
        @NameInMap("AdList")
        public java.util.List<GetPageConfigResponseBodyResultAdList> adList;

        public static GetPageConfigResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetPageConfigResponseBodyResult self = new GetPageConfigResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetPageConfigResponseBodyResult setAdList(java.util.List<GetPageConfigResponseBodyResultAdList> adList) {
            this.adList = adList;
            return this;
        }
        public java.util.List<GetPageConfigResponseBodyResultAdList> getAdList() {
            return this.adList;
        }

    }

}
