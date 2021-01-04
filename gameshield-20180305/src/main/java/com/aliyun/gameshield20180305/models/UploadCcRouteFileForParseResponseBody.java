// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UploadCcRouteFileForParseResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    @NameInMap("RouteRules")
    public java.util.List<UploadCcRouteFileForParseResponseBodyRouteRules> routeRules;

    public static UploadCcRouteFileForParseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadCcRouteFileForParseResponseBody self = new UploadCcRouteFileForParseResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadCcRouteFileForParseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadCcRouteFileForParseResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public UploadCcRouteFileForParseResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public UploadCcRouteFileForParseResponseBody setRouteRules(java.util.List<UploadCcRouteFileForParseResponseBodyRouteRules> routeRules) {
        this.routeRules = routeRules;
        return this;
    }
    public java.util.List<UploadCcRouteFileForParseResponseBodyRouteRules> getRouteRules() {
        return this.routeRules;
    }

    public static class UploadCcRouteFileForParseResponseBodyRouteRules extends TeaModel {
        @NameInMap("Comment")
        public String comment;

        @NameInMap("Rservers")
        public java.util.List<String> rservers;

        @NameInMap("Id")
        public String id;

        public static UploadCcRouteFileForParseResponseBodyRouteRules build(java.util.Map<String, ?> map) throws Exception {
            UploadCcRouteFileForParseResponseBodyRouteRules self = new UploadCcRouteFileForParseResponseBodyRouteRules();
            return TeaModel.build(map, self);
        }

        public UploadCcRouteFileForParseResponseBodyRouteRules setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public UploadCcRouteFileForParseResponseBodyRouteRules setRservers(java.util.List<String> rservers) {
            this.rservers = rservers;
            return this;
        }
        public java.util.List<String> getRservers() {
            return this.rservers;
        }

        public UploadCcRouteFileForParseResponseBodyRouteRules setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
