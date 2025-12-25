// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20190601.models;

import com.aliyun.tea.*;

public class QueryConvertPrepayInstancePriceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConvertPrepayInstanceRequest")
    public QueryConvertPrepayInstancePriceRequestConvertPrepayInstanceRequest convertPrepayInstanceRequest;

    public static QueryConvertPrepayInstancePriceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryConvertPrepayInstancePriceRequest self = new QueryConvertPrepayInstancePriceRequest();
        return TeaModel.build(map, self);
    }

    public QueryConvertPrepayInstancePriceRequest setConvertPrepayInstanceRequest(QueryConvertPrepayInstancePriceRequestConvertPrepayInstanceRequest convertPrepayInstanceRequest) {
        this.convertPrepayInstanceRequest = convertPrepayInstanceRequest;
        return this;
    }
    public QueryConvertPrepayInstancePriceRequestConvertPrepayInstanceRequest getConvertPrepayInstanceRequest() {
        return this.convertPrepayInstanceRequest;
    }

    public static class QueryConvertPrepayInstancePriceRequestConvertPrepayInstanceRequest extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Region")
        public String region;

        public static QueryConvertPrepayInstancePriceRequestConvertPrepayInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
            QueryConvertPrepayInstancePriceRequestConvertPrepayInstanceRequest self = new QueryConvertPrepayInstancePriceRequestConvertPrepayInstanceRequest();
            return TeaModel.build(map, self);
        }

        public QueryConvertPrepayInstancePriceRequestConvertPrepayInstanceRequest setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryConvertPrepayInstancePriceRequestConvertPrepayInstanceRequest setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
