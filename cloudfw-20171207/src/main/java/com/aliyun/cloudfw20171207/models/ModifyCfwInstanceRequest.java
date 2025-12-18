// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyCfwInstanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cfw_elasticity_public_cn-zsk39m******</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("UpdateList")
    public java.util.List<ModifyCfwInstanceRequestUpdateList> updateList;

    public static ModifyCfwInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCfwInstanceRequest self = new ModifyCfwInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCfwInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyCfwInstanceRequest setUpdateList(java.util.List<ModifyCfwInstanceRequestUpdateList> updateList) {
        this.updateList = updateList;
        return this;
    }
    public java.util.List<ModifyCfwInstanceRequestUpdateList> getUpdateList() {
        return this.updateList;
    }

    public static class ModifyCfwInstanceRequestUpdateList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Sdl</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Value")
        public String value;

        public static ModifyCfwInstanceRequestUpdateList build(java.util.Map<String, ?> map) throws Exception {
            ModifyCfwInstanceRequestUpdateList self = new ModifyCfwInstanceRequestUpdateList();
            return TeaModel.build(map, self);
        }

        public ModifyCfwInstanceRequestUpdateList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ModifyCfwInstanceRequestUpdateList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
