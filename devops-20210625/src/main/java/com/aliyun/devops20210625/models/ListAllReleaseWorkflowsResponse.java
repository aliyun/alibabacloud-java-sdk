// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListAllReleaseWorkflowsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public java.util.List<ListAllReleaseWorkflowsResponseBody> body;

    public static ListAllReleaseWorkflowsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAllReleaseWorkflowsResponse self = new ListAllReleaseWorkflowsResponse();
        return TeaModel.build(map, self);
    }

    public ListAllReleaseWorkflowsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAllReleaseWorkflowsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAllReleaseWorkflowsResponse setBody(java.util.List<ListAllReleaseWorkflowsResponseBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<ListAllReleaseWorkflowsResponseBody> getBody() {
        return this.body;
    }

    public static class ListAllReleaseWorkflowsResponseBodyReleaseStagesVariableGroups extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>dev</p>
         */
        @NameInMap("name")
        public String name;

        @NameInMap("displayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>APP</p>
         */
        @NameInMap("type")
        public String type;

        public static ListAllReleaseWorkflowsResponseBodyReleaseStagesVariableGroups build(java.util.Map<String, ?> map) throws Exception {
            ListAllReleaseWorkflowsResponseBodyReleaseStagesVariableGroups self = new ListAllReleaseWorkflowsResponseBodyReleaseStagesVariableGroups();
            return TeaModel.build(map, self);
        }

        public ListAllReleaseWorkflowsResponseBodyReleaseStagesVariableGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAllReleaseWorkflowsResponseBodyReleaseStagesVariableGroups setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListAllReleaseWorkflowsResponseBodyReleaseStagesVariableGroups setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListAllReleaseWorkflowsResponseBodyReleaseStages extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>testApp</p>
         */
        @NameInMap("appName")
        public String appName;

        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>5aa8cc67e75e41bf9dddeb708775bcc3</p>
         */
        @NameInMap("sn")
        public String sn;

        /**
         * <strong>example:</strong>
         * <p>ce51b31b996246ecaf874736838360b2</p>
         */
        @NameInMap("releaseWorkflowSn")
        public String releaseWorkflowSn;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("order")
        public String order;

        @NameInMap("variableGroups")
        public java.util.List<ListAllReleaseWorkflowsResponseBodyReleaseStagesVariableGroups> variableGroups;

        public static ListAllReleaseWorkflowsResponseBodyReleaseStages build(java.util.Map<String, ?> map) throws Exception {
            ListAllReleaseWorkflowsResponseBodyReleaseStages self = new ListAllReleaseWorkflowsResponseBodyReleaseStages();
            return TeaModel.build(map, self);
        }

        public ListAllReleaseWorkflowsResponseBodyReleaseStages setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListAllReleaseWorkflowsResponseBodyReleaseStages setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAllReleaseWorkflowsResponseBodyReleaseStages setSn(String sn) {
            this.sn = sn;
            return this;
        }
        public String getSn() {
            return this.sn;
        }

        public ListAllReleaseWorkflowsResponseBodyReleaseStages setReleaseWorkflowSn(String releaseWorkflowSn) {
            this.releaseWorkflowSn = releaseWorkflowSn;
            return this;
        }
        public String getReleaseWorkflowSn() {
            return this.releaseWorkflowSn;
        }

        public ListAllReleaseWorkflowsResponseBodyReleaseStages setOrder(String order) {
            this.order = order;
            return this;
        }
        public String getOrder() {
            return this.order;
        }

        public ListAllReleaseWorkflowsResponseBodyReleaseStages setVariableGroups(java.util.List<ListAllReleaseWorkflowsResponseBodyReleaseStagesVariableGroups> variableGroups) {
            this.variableGroups = variableGroups;
            return this;
        }
        public java.util.List<ListAllReleaseWorkflowsResponseBodyReleaseStagesVariableGroups> getVariableGroups() {
            return this.variableGroups;
        }

    }

    public static class ListAllReleaseWorkflowsResponseBody extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>testApp</p>
         */
        @NameInMap("appName")
        public String appName;

        /**
         * <strong>example:</strong>
         * <p>ce51b31b996246ecaf874736838360b2</p>
         */
        @NameInMap("sn")
        public String sn;

        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("order")
        public String order;

        @NameInMap("releaseStages")
        public java.util.List<ListAllReleaseWorkflowsResponseBodyReleaseStages> releaseStages;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("note")
        public String note;

        public static ListAllReleaseWorkflowsResponseBody build(java.util.Map<String, ?> map) throws Exception {
            ListAllReleaseWorkflowsResponseBody self = new ListAllReleaseWorkflowsResponseBody();
            return TeaModel.build(map, self);
        }

        public ListAllReleaseWorkflowsResponseBody setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListAllReleaseWorkflowsResponseBody setSn(String sn) {
            this.sn = sn;
            return this;
        }
        public String getSn() {
            return this.sn;
        }

        public ListAllReleaseWorkflowsResponseBody setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAllReleaseWorkflowsResponseBody setOrder(String order) {
            this.order = order;
            return this;
        }
        public String getOrder() {
            return this.order;
        }

        public ListAllReleaseWorkflowsResponseBody setReleaseStages(java.util.List<ListAllReleaseWorkflowsResponseBodyReleaseStages> releaseStages) {
            this.releaseStages = releaseStages;
            return this;
        }
        public java.util.List<ListAllReleaseWorkflowsResponseBodyReleaseStages> getReleaseStages() {
            return this.releaseStages;
        }

        public ListAllReleaseWorkflowsResponseBody setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

    }

}
