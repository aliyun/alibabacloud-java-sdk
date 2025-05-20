// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AddMultiDimTableRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>r1R7q3QmWew5lo02fxB7nxxxxxxxx</p>
     */
    @NameInMap("BaseId")
    public String baseId;

    @NameInMap("Fields")
    public java.util.List<AddMultiDimTableRequestFields> fields;

    @NameInMap("Name")
    public String name;

    @NameInMap("TenantContext")
    public AddMultiDimTableRequestTenantContext tenantContext;

    public static AddMultiDimTableRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMultiDimTableRequest self = new AddMultiDimTableRequest();
        return TeaModel.build(map, self);
    }

    public AddMultiDimTableRequest setBaseId(String baseId) {
        this.baseId = baseId;
        return this;
    }
    public String getBaseId() {
        return this.baseId;
    }

    public AddMultiDimTableRequest setFields(java.util.List<AddMultiDimTableRequestFields> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<AddMultiDimTableRequestFields> getFields() {
        return this.fields;
    }

    public AddMultiDimTableRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddMultiDimTableRequest setTenantContext(AddMultiDimTableRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public AddMultiDimTableRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class AddMultiDimTableRequestFields extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("Property")
        public java.util.Map<String, ?> property;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("Type")
        public String type;

        public static AddMultiDimTableRequestFields build(java.util.Map<String, ?> map) throws Exception {
            AddMultiDimTableRequestFields self = new AddMultiDimTableRequestFields();
            return TeaModel.build(map, self);
        }

        public AddMultiDimTableRequestFields setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddMultiDimTableRequestFields setProperty(java.util.Map<String, ?> property) {
            this.property = property;
            return this;
        }
        public java.util.Map<String, ?> getProperty() {
            return this.property;
        }

        public AddMultiDimTableRequestFields setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class AddMultiDimTableRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static AddMultiDimTableRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            AddMultiDimTableRequestTenantContext self = new AddMultiDimTableRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public AddMultiDimTableRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
