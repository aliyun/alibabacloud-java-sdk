// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class GetStorageResponseBody extends TeaModel {
    /**
     * <p>The details of the storage settings.</p>
     */
    @NameInMap("Data")
    public GetStorageResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>97A31C3A-3F9F-5866-8979-5159E3DC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetStorageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStorageResponseBody self = new GetStorageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStorageResponseBody setData(GetStorageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetStorageResponseBodyData getData() {
        return this.data;
    }

    public GetStorageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetStorageResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether you can change the storage region. You can change the storage region only once. The default value is false. Valid values:</p>
         * <ul>
         * <li><p>true: You can change the storage region.</p>
         * </li>
         * <li><p>false: You cannot change the storage region.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CanOperate")
        public Boolean canOperate;

        /**
         * <p>Indicates whether you have permission to change the storage region. The default value is false. Valid values:</p>
         * <ul>
         * <li><p>true: You have permission.</p>
         * </li>
         * <li><p>false: You do not have permission.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DisplayRegion")
        public Boolean displayRegion;

        /**
         * <p>The storage region.</p>
         * <p>If the Data Management hub is in the <strong>cn-hangzhou</strong> region, the default value of <strong>Region</strong> is \<code>cn-shanghai\\</code>. If the Data Management hub is in the <strong>ap-southeast-1</strong> region, the default value of <strong>Region</strong> is \<code>ap-southeast-1\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The storage duration in days. The default value is 180. The value must be an integer from 30 to 3000.</p>
         * 
         * <strong>example:</strong>
         * <p>180</p>
         */
        @NameInMap("Ttl")
        public Integer ttl;

        public static GetStorageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetStorageResponseBodyData self = new GetStorageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetStorageResponseBodyData setCanOperate(Boolean canOperate) {
            this.canOperate = canOperate;
            return this;
        }
        public Boolean getCanOperate() {
            return this.canOperate;
        }

        public GetStorageResponseBodyData setDisplayRegion(Boolean displayRegion) {
            this.displayRegion = displayRegion;
            return this;
        }
        public Boolean getDisplayRegion() {
            return this.displayRegion;
        }

        public GetStorageResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetStorageResponseBodyData setTtl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public Integer getTtl() {
            return this.ttl;
        }

    }

}
