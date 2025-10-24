// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class InstanceHealerResponseBody extends TeaModel {
    @NameInMap("InstanceHealerModel")
    public InstanceHealerResponseBodyInstanceHealerModel instanceHealerModel;

    /**
     * <strong>example:</strong>
     * <p>7B9EFA4F-4305-5968-BAEE-BD8B8DE5****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static InstanceHealerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InstanceHealerResponseBody self = new InstanceHealerResponseBody();
        return TeaModel.build(map, self);
    }

    public InstanceHealerResponseBody setInstanceHealerModel(InstanceHealerResponseBodyInstanceHealerModel instanceHealerModel) {
        this.instanceHealerModel = instanceHealerModel;
        return this;
    }
    public InstanceHealerResponseBodyInstanceHealerModel getInstanceHealerModel() {
        return this.instanceHealerModel;
    }

    public InstanceHealerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class InstanceHealerResponseBodyInstanceHealerModel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Result")
        public String result;

        public static InstanceHealerResponseBodyInstanceHealerModel build(java.util.Map<String, ?> map) throws Exception {
            InstanceHealerResponseBodyInstanceHealerModel self = new InstanceHealerResponseBodyInstanceHealerModel();
            return TeaModel.build(map, self);
        }

        public InstanceHealerResponseBodyInstanceHealerModel setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

    }

}
