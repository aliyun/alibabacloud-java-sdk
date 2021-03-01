// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteUserDefineRegionResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RegionDefine")
    public DeleteUserDefineRegionResponseBodyRegionDefine regionDefine;

    @NameInMap("Code")
    public Integer code;

    public static DeleteUserDefineRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserDefineRegionResponseBody self = new DeleteUserDefineRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUserDefineRegionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteUserDefineRegionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteUserDefineRegionResponseBody setRegionDefine(DeleteUserDefineRegionResponseBodyRegionDefine regionDefine) {
        this.regionDefine = regionDefine;
        return this;
    }
    public DeleteUserDefineRegionResponseBodyRegionDefine getRegionDefine() {
        return this.regionDefine;
    }

    public DeleteUserDefineRegionResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class DeleteUserDefineRegionResponseBodyRegionDefine extends TeaModel {
        @NameInMap("BelongRegion")
        public String belongRegion;

        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("Description")
        public String description;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("RegionId")
        public String regionId;

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

        public DeleteUserDefineRegionResponseBodyRegionDefine setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public DeleteUserDefineRegionResponseBodyRegionDefine setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DeleteUserDefineRegionResponseBodyRegionDefine setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
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

    }

}
