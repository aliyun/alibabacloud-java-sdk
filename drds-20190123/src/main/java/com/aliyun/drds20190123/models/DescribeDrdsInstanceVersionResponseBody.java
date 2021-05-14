// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsInstanceVersionResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DescribeDrdsInstanceVersionResponseBodyData data;

    public static DescribeDrdsInstanceVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsInstanceVersionResponseBody self = new DescribeDrdsInstanceVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsInstanceVersionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDrdsInstanceVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsInstanceVersionResponseBody setData(DescribeDrdsInstanceVersionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDrdsInstanceVersionResponseBodyData getData() {
        return this.data;
    }

    public static class DescribeDrdsInstanceVersionResponseBodyData extends TeaModel {
        @NameInMap("NewestVersion")
        public String newestVersion;

        @NameInMap("InstanceVersion")
        public String instanceVersion;

        public static DescribeDrdsInstanceVersionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstanceVersionResponseBodyData self = new DescribeDrdsInstanceVersionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstanceVersionResponseBodyData setNewestVersion(String newestVersion) {
            this.newestVersion = newestVersion;
            return this;
        }
        public String getNewestVersion() {
            return this.newestVersion;
        }

        public DescribeDrdsInstanceVersionResponseBodyData setInstanceVersion(String instanceVersion) {
            this.instanceVersion = instanceVersion;
            return this;
        }
        public String getInstanceVersion() {
            return this.instanceVersion;
        }

    }

}
