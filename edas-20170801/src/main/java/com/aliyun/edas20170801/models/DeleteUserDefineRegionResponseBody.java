// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteUserDefineRegionResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The additional information that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The custom namespace.</p>
     */
    @NameInMap("RegionDefine")
    public DeleteUserDefineRegionResponseBodyRegionDefine regionDefine;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteUserDefineRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserDefineRegionResponseBody self = new DeleteUserDefineRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUserDefineRegionResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeleteUserDefineRegionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteUserDefineRegionResponseBody setRegionDefine(DeleteUserDefineRegionResponseBodyRegionDefine regionDefine) {
        this.regionDefine = regionDefine;
        return this;
    }
    public DeleteUserDefineRegionResponseBodyRegionDefine getRegionDefine() {
        return this.regionDefine;
    }

    public DeleteUserDefineRegionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteUserDefineRegionResponseBodyRegionDefine extends TeaModel {
        /**
         * <p>The ID of the region to which the custom namespace belongs.</p>
         */
        @NameInMap("BelongRegion")
        public String belongRegion;

        /**
         * <p>The description of the custom namespace.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The unique identifier of the custom namespace.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The ID of the custom namespace. The ID cannot be changed after the custom namespace is created. The format is `region ID:custom namespace ID`.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the custom namespace.</p>
         */
        @NameInMap("RegionName")
        public String regionName;

        /**
         * <p>The ID of the Alibaba Cloud account to which the custom namespace belongs.</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static DeleteUserDefineRegionResponseBodyRegionDefine build(java.util.Map<String, ?> map) throws Exception {
            DeleteUserDefineRegionResponseBodyRegionDefine self = new DeleteUserDefineRegionResponseBodyRegionDefine();
            return TeaModel.build(map, self);
        }

        public DeleteUserDefineRegionResponseBodyRegionDefine setBelongRegion(String belongRegion) {
            this.belongRegion = belongRegion;
            return this;
        }
        public String getBelongRegion() {
            return this.belongRegion;
        }

        public DeleteUserDefineRegionResponseBodyRegionDefine setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DeleteUserDefineRegionResponseBodyRegionDefine setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DeleteUserDefineRegionResponseBodyRegionDefine setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DeleteUserDefineRegionResponseBodyRegionDefine setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public DeleteUserDefineRegionResponseBodyRegionDefine setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
