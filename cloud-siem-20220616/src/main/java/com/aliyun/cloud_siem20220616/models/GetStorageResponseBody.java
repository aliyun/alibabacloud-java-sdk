// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class GetStorageResponseBody extends TeaModel {
    /**
     * <p>The information about the storage.</p>
     */
    @NameInMap("Data")
    public GetStorageResponseBodyData data;

    /**
     * <p>The request ID.</p>
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
         * <p>Indicates whether the storage region can be changed for once. Default value: false Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CanOperate")
        public Boolean canOperate;

        /**
         * <p>Indicates whether the storage region can be changed. Default value: false Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DisplayRegion")
        public Boolean displayRegion;

        /**
         * <p>The region where the data is stored.</p>
         * <p>If the data management center is <strong>cn-hangzhou</strong>, the default value of <strong>Region</strong> is cn-shanghai, which specifies the China (Shanghai) region. If the data management center is <strong>ap-southeast-1</strong>, the default value of <strong>Region</strong> is ap-southeast-1, which specifies the Singapore region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The storage period of logs. Unit: day. Default value: 180. Valid values: 30 to 3000.</p>
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
