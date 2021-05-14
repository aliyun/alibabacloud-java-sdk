// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsInstanceVersionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public DescribeDrdsInstanceVersionResponseData data;

    public static DescribeDrdsInstanceVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsInstanceVersionResponse self = new DescribeDrdsInstanceVersionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsInstanceVersionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsInstanceVersionResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDrdsInstanceVersionResponse setData(DescribeDrdsInstanceVersionResponseData data) {
        this.data = data;
        return this;
    }
    public DescribeDrdsInstanceVersionResponseData getData() {
        return this.data;
    }

    public static class DescribeDrdsInstanceVersionResponseData extends TeaModel {
        @NameInMap("InstanceVersion")
        @Validation(required = true)
        public String instanceVersion;

        @NameInMap("NewestVersion")
        @Validation(required = true)
        public String newestVersion;

        public static DescribeDrdsInstanceVersionResponseData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstanceVersionResponseData self = new DescribeDrdsInstanceVersionResponseData();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstanceVersionResponseData setInstanceVersion(String instanceVersion) {
            this.instanceVersion = instanceVersion;
            return this;
        }
        public String getInstanceVersion() {
            return this.instanceVersion;
        }

        public DescribeDrdsInstanceVersionResponseData setNewestVersion(String newestVersion) {
            this.newestVersion = newestVersion;
            return this;
        }
        public String getNewestVersion() {
            return this.newestVersion;
        }

    }

}
