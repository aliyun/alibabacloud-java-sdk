// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertOrUpdateRegionResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The additional information that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>37793352-C568-4A5A-BF69-4DC853******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the custom namespace.</p>
     */
    @NameInMap("UserDefineRegionEntity")
    public InsertOrUpdateRegionResponseBodyUserDefineRegionEntity userDefineRegionEntity;

    public static InsertOrUpdateRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InsertOrUpdateRegionResponseBody self = new InsertOrUpdateRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public InsertOrUpdateRegionResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public InsertOrUpdateRegionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InsertOrUpdateRegionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InsertOrUpdateRegionResponseBody setUserDefineRegionEntity(InsertOrUpdateRegionResponseBodyUserDefineRegionEntity userDefineRegionEntity) {
        this.userDefineRegionEntity = userDefineRegionEntity;
        return this;
    }
    public InsertOrUpdateRegionResponseBodyUserDefineRegionEntity getUserDefineRegionEntity() {
        return this.userDefineRegionEntity;
    }

    public static class InsertOrUpdateRegionResponseBodyUserDefineRegionEntity extends TeaModel {
        /**
         * <p>The ID of the region to which the namespace belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("BelongRegion")
        public String belongRegion;

        /**
         * <p>Indicates whether remote debugging is enabled. Valid values:</p>
         * <ul>
         * <li>true: Remote debugging is enabled.</li>
         * <li>false: Remote debugging is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DebugEnable")
        public Boolean debugEnable;

        /**
         * <p>The description of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>Logical region</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the namespace is created or modified. If this parameter is left empty or 0 is returned, the namespace is created. Otherwise, the namespace is modified.</p>
         * 
         * <strong>example:</strong>
         * <p>15160</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The ID of the namespace.</p>
         * <ul>
         * <li>The ID of a custom namespace is in the <code>region ID:namespace identifier</code> format. Example: cn-beijing:tdy218.</li>
         * <li>The ID of the default namespace is in the <code>region ID</code> format. Example: cn-beijing.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing:test</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>test_region</p>
         */
        @NameInMap("RegionName")
        public String regionName;

        /**
         * <p>The ID of the Alibaba Cloud account to which the custom namespace belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>edas_****_test@aliyun-****.com</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static InsertOrUpdateRegionResponseBodyUserDefineRegionEntity build(java.util.Map<String, ?> map) throws Exception {
            InsertOrUpdateRegionResponseBodyUserDefineRegionEntity self = new InsertOrUpdateRegionResponseBodyUserDefineRegionEntity();
            return TeaModel.build(map, self);
        }

        public InsertOrUpdateRegionResponseBodyUserDefineRegionEntity setBelongRegion(String belongRegion) {
            this.belongRegion = belongRegion;
            return this;
        }
        public String getBelongRegion() {
            return this.belongRegion;
        }

        public InsertOrUpdateRegionResponseBodyUserDefineRegionEntity setDebugEnable(Boolean debugEnable) {
            this.debugEnable = debugEnable;
            return this;
        }
        public Boolean getDebugEnable() {
            return this.debugEnable;
        }

        public InsertOrUpdateRegionResponseBodyUserDefineRegionEntity setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public InsertOrUpdateRegionResponseBodyUserDefineRegionEntity setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public InsertOrUpdateRegionResponseBodyUserDefineRegionEntity setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public InsertOrUpdateRegionResponseBodyUserDefineRegionEntity setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public InsertOrUpdateRegionResponseBodyUserDefineRegionEntity setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
