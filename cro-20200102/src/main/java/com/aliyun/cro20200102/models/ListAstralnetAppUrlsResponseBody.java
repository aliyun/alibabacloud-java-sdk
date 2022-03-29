// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class ListAstralnetAppUrlsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListAstralnetAppUrlsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListAstralnetAppUrlsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAstralnetAppUrlsResponseBody self = new ListAstralnetAppUrlsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAstralnetAppUrlsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListAstralnetAppUrlsResponseBody setData(ListAstralnetAppUrlsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListAstralnetAppUrlsResponseBodyData getData() {
        return this.data;
    }

    public ListAstralnetAppUrlsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAstralnetAppUrlsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAstralnetAppUrlsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAstralnetAppUrlsResponseBodyDataItem extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("Class")
        public String _class;

        @NameInMap("ContentType")
        public String contentType;

        @NameInMap("FilePath")
        public String filePath;

        @NameInMap("Host")
        public String host;

        @NameInMap("Method")
        public String method;

        @NameInMap("MethodProfile")
        public String methodProfile;

        @NameInMap("Parameters")
        public String parameters;

        @NameInMap("Path")
        public String path;

        @NameInMap("ResponseBody")
        public String responseBody;

        @NameInMap("UrlPath")
        public String urlPath;

        @NameInMap("UrlSuffixes")
        public String urlSuffixes;

        public static ListAstralnetAppUrlsResponseBodyDataItem build(java.util.Map<String, ?> map) throws Exception {
            ListAstralnetAppUrlsResponseBodyDataItem self = new ListAstralnetAppUrlsResponseBodyDataItem();
            return TeaModel.build(map, self);
        }

        public ListAstralnetAppUrlsResponseBodyDataItem setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListAstralnetAppUrlsResponseBodyDataItem set_class(String _class) {
            this._class = _class;
            return this;
        }
        public String get_class() {
            return this._class;
        }

        public ListAstralnetAppUrlsResponseBodyDataItem setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public ListAstralnetAppUrlsResponseBodyDataItem setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public ListAstralnetAppUrlsResponseBodyDataItem setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public ListAstralnetAppUrlsResponseBodyDataItem setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public ListAstralnetAppUrlsResponseBodyDataItem setMethodProfile(String methodProfile) {
            this.methodProfile = methodProfile;
            return this;
        }
        public String getMethodProfile() {
            return this.methodProfile;
        }

        public ListAstralnetAppUrlsResponseBodyDataItem setParameters(String parameters) {
            this.parameters = parameters;
            return this;
        }
        public String getParameters() {
            return this.parameters;
        }

        public ListAstralnetAppUrlsResponseBodyDataItem setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListAstralnetAppUrlsResponseBodyDataItem setResponseBody(String responseBody) {
            this.responseBody = responseBody;
            return this;
        }
        public String getResponseBody() {
            return this.responseBody;
        }

        public ListAstralnetAppUrlsResponseBodyDataItem setUrlPath(String urlPath) {
            this.urlPath = urlPath;
            return this;
        }
        public String getUrlPath() {
            return this.urlPath;
        }

        public ListAstralnetAppUrlsResponseBodyDataItem setUrlSuffixes(String urlSuffixes) {
            this.urlSuffixes = urlSuffixes;
            return this;
        }
        public String getUrlSuffixes() {
            return this.urlSuffixes;
        }

    }

    public static class ListAstralnetAppUrlsResponseBodyData extends TeaModel {
        @NameInMap("Item")
        public java.util.List<ListAstralnetAppUrlsResponseBodyDataItem> item;

        @NameInMap("Total")
        public Integer total;

        public static ListAstralnetAppUrlsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAstralnetAppUrlsResponseBodyData self = new ListAstralnetAppUrlsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAstralnetAppUrlsResponseBodyData setItem(java.util.List<ListAstralnetAppUrlsResponseBodyDataItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<ListAstralnetAppUrlsResponseBodyDataItem> getItem() {
            return this.item;
        }

        public ListAstralnetAppUrlsResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
