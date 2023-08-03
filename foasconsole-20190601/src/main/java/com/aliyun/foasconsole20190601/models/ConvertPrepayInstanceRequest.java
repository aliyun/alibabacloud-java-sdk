// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20190601.models;

import com.aliyun.tea.*;

public class ConvertPrepayInstanceRequest extends TeaModel {
    @NameInMap("ConvertPrepayInstanceRequest")
    public ConvertPrepayInstanceRequestConvertPrepayInstanceRequest convertPrepayInstanceRequest;

    public static ConvertPrepayInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ConvertPrepayInstanceRequest self = new ConvertPrepayInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ConvertPrepayInstanceRequest setConvertPrepayInstanceRequest(ConvertPrepayInstanceRequestConvertPrepayInstanceRequest convertPrepayInstanceRequest) {
        this.convertPrepayInstanceRequest = convertPrepayInstanceRequest;
        return this;
    }
    public ConvertPrepayInstanceRequestConvertPrepayInstanceRequest getConvertPrepayInstanceRequest() {
        return this.convertPrepayInstanceRequest;
    }

    public static class ConvertPrepayInstanceRequestConvertPrepayInstanceRequest extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Region")
        public String region;

        public static ConvertPrepayInstanceRequestConvertPrepayInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
            ConvertPrepayInstanceRequestConvertPrepayInstanceRequest self = new ConvertPrepayInstanceRequestConvertPrepayInstanceRequest();
            return TeaModel.build(map, self);
        }

        public ConvertPrepayInstanceRequestConvertPrepayInstanceRequest setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ConvertPrepayInstanceRequestConvertPrepayInstanceRequest setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
