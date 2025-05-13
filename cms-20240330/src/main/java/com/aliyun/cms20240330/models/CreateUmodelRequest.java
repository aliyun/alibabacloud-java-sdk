// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateUmodelRequest extends TeaModel {
    @NameInMap("commonSchemaRef")
    public java.util.List<CreateUmodelRequestCommonSchemaRef> commonSchemaRef;

    /**
     * <strong>example:</strong>
     * <p>workspace test</p>
     */
    @NameInMap("description")
    public String description;

    public static CreateUmodelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUmodelRequest self = new CreateUmodelRequest();
        return TeaModel.build(map, self);
    }

    public CreateUmodelRequest setCommonSchemaRef(java.util.List<CreateUmodelRequestCommonSchemaRef> commonSchemaRef) {
        this.commonSchemaRef = commonSchemaRef;
        return this;
    }
    public java.util.List<CreateUmodelRequestCommonSchemaRef> getCommonSchemaRef() {
        return this.commonSchemaRef;
    }

    public CreateUmodelRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public static class CreateUmodelRequestCommonSchemaRef extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test-job-123</p>
         */
        @NameInMap("group")
        public String group;

        @NameInMap("items")
        public java.util.List<String> items;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("version")
        public String version;

        public static CreateUmodelRequestCommonSchemaRef build(java.util.Map<String, ?> map) throws Exception {
            CreateUmodelRequestCommonSchemaRef self = new CreateUmodelRequestCommonSchemaRef();
            return TeaModel.build(map, self);
        }

        public CreateUmodelRequestCommonSchemaRef setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public CreateUmodelRequestCommonSchemaRef setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

        public CreateUmodelRequestCommonSchemaRef setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
