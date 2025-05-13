// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetUmodelResponseBody extends TeaModel {
    @NameInMap("commonSchemaRef")
    public java.util.List<GetUmodelResponseBodyCommonSchemaRef> commonSchemaRef;

    /**
     * <strong>example:</strong>
     * <p>workspace test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>cn-heyuan</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>123-123123-sdf-435-3123</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>workspace-test</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static GetUmodelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUmodelResponseBody self = new GetUmodelResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUmodelResponseBody setCommonSchemaRef(java.util.List<GetUmodelResponseBodyCommonSchemaRef> commonSchemaRef) {
        this.commonSchemaRef = commonSchemaRef;
        return this;
    }
    public java.util.List<GetUmodelResponseBodyCommonSchemaRef> getCommonSchemaRef() {
        return this.commonSchemaRef;
    }

    public GetUmodelResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetUmodelResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetUmodelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUmodelResponseBody setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public static class GetUmodelResponseBodyCommonSchemaRef extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test-job-123123</p>
         */
        @NameInMap("group")
        public String group;

        @NameInMap("items")
        public java.util.List<String> items;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("version")
        public String version;

        public static GetUmodelResponseBodyCommonSchemaRef build(java.util.Map<String, ?> map) throws Exception {
            GetUmodelResponseBodyCommonSchemaRef self = new GetUmodelResponseBodyCommonSchemaRef();
            return TeaModel.build(map, self);
        }

        public GetUmodelResponseBodyCommonSchemaRef setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public GetUmodelResponseBodyCommonSchemaRef setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

        public GetUmodelResponseBodyCommonSchemaRef setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
