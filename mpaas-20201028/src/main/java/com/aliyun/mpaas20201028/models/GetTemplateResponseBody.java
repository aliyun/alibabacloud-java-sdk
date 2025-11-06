// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class GetTemplateResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetTemplateResponseBodyData data;

    @NameInMap("Msg")
    public String msg;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateResponseBody self = new GetTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTemplateResponseBody setData(GetTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTemplateResponseBodyData getData() {
        return this.data;
    }

    public GetTemplateResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTemplateResponseBodyData extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("Content")
        public String content;

        @NameInMap("DescInfo")
        public String descInfo;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("IconUrls")
        public String iconUrls;

        @NameInMap("Id")
        public String id;

        @NameInMap("ImageUrls")
        public String imageUrls;

        @NameInMap("Name")
        public String name;

        @NameInMap("PushStyle")
        public String pushStyle;

        @NameInMap("ShowStyle")
        public String showStyle;

        @NameInMap("Title")
        public String title;

        @NameInMap("Uri")
        public String uri;

        @NameInMap("Variables")
        public String variables;

        public static GetTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateResponseBodyData self = new GetTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTemplateResponseBodyData setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GetTemplateResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetTemplateResponseBodyData setDescInfo(String descInfo) {
            this.descInfo = descInfo;
            return this;
        }
        public String getDescInfo() {
            return this.descInfo;
        }

        public GetTemplateResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetTemplateResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetTemplateResponseBodyData setIconUrls(String iconUrls) {
            this.iconUrls = iconUrls;
            return this;
        }
        public String getIconUrls() {
            return this.iconUrls;
        }

        public GetTemplateResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetTemplateResponseBodyData setImageUrls(String imageUrls) {
            this.imageUrls = imageUrls;
            return this;
        }
        public String getImageUrls() {
            return this.imageUrls;
        }

        public GetTemplateResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTemplateResponseBodyData setPushStyle(String pushStyle) {
            this.pushStyle = pushStyle;
            return this;
        }
        public String getPushStyle() {
            return this.pushStyle;
        }

        public GetTemplateResponseBodyData setShowStyle(String showStyle) {
            this.showStyle = showStyle;
            return this;
        }
        public String getShowStyle() {
            return this.showStyle;
        }

        public GetTemplateResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetTemplateResponseBodyData setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

        public GetTemplateResponseBodyData setVariables(String variables) {
            this.variables = variables;
            return this;
        }
        public String getVariables() {
            return this.variables;
        }

    }

}
