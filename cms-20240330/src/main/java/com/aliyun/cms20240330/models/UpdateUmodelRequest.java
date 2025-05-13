// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateUmodelRequest extends TeaModel {
    @NameInMap("commonSchemaRef")
    public java.util.List<UpdateUmodelRequestCommonSchemaRef> commonSchemaRef;

    /**
     * <strong>example:</strong>
     * <p>workspace test</p>
     */
    @NameInMap("description")
    public String description;

    public static UpdateUmodelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUmodelRequest self = new UpdateUmodelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUmodelRequest setCommonSchemaRef(java.util.List<UpdateUmodelRequestCommonSchemaRef> commonSchemaRef) {
        this.commonSchemaRef = commonSchemaRef;
        return this;
    }
    public java.util.List<UpdateUmodelRequestCommonSchemaRef> getCommonSchemaRef() {
        return this.commonSchemaRef;
    }

    public UpdateUmodelRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public static class UpdateUmodelRequestCommonSchemaRef extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test-bmp-123123</p>
         */
        @NameInMap("group")
        public String group;

        @NameInMap("items")
        public java.util.List<String> items;

        /**
         * <strong>example:</strong>
         * <p>2.5.</p>
         */
        @NameInMap("version")
        public String version;

        public static UpdateUmodelRequestCommonSchemaRef build(java.util.Map<String, ?> map) throws Exception {
            UpdateUmodelRequestCommonSchemaRef self = new UpdateUmodelRequestCommonSchemaRef();
            return TeaModel.build(map, self);
        }

        public UpdateUmodelRequestCommonSchemaRef setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public UpdateUmodelRequestCommonSchemaRef setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

        public UpdateUmodelRequestCommonSchemaRef setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
