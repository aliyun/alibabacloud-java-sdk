// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsInstanceVersionResponseBody extends TeaModel {
    /**
     * <p>The details about the instance version.</p>
     */
    @NameInMap("Data")
    public DescribeDrdsInstanceVersionResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeDrdsInstanceVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsInstanceVersionResponseBody self = new DescribeDrdsInstanceVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsInstanceVersionResponseBody setData(DescribeDrdsInstanceVersionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDrdsInstanceVersionResponseBodyData getData() {
        return this.data;
    }

    public DescribeDrdsInstanceVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsInstanceVersionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDrdsInstanceVersionResponseBodyData extends TeaModel {
        /**
         * <p>The current version of the instance.</p>
         */
        @NameInMap("InstanceVersion")
        public String instanceVersion;

        /**
         * <p>The latest version of the instance.</p>
         */
        @NameInMap("NewestVersion")
        public String newestVersion;

        public static DescribeDrdsInstanceVersionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstanceVersionResponseBodyData self = new DescribeDrdsInstanceVersionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstanceVersionResponseBodyData setInstanceVersion(String instanceVersion) {
            this.instanceVersion = instanceVersion;
            return this;
        }
        public String getInstanceVersion() {
            return this.instanceVersion;
        }

        public DescribeDrdsInstanceVersionResponseBodyData setNewestVersion(String newestVersion) {
            this.newestVersion = newestVersion;
            return this;
        }
        public String getNewestVersion() {
            return this.newestVersion;
        }

    }

}
