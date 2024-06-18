// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListDriveSpacesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>fekaf</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("spaces")
    public java.util.List<ListDriveSpacesResponseBodySpaces> spaces;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    /**
     * <strong>example:</strong>
     * <p>dingtalk</p>
     */
    @NameInMap("vendorType")
    public String vendorType;

    public static ListDriveSpacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDriveSpacesResponseBody self = new ListDriveSpacesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDriveSpacesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDriveSpacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDriveSpacesResponseBody setSpaces(java.util.List<ListDriveSpacesResponseBodySpaces> spaces) {
        this.spaces = spaces;
        return this;
    }
    public java.util.List<ListDriveSpacesResponseBodySpaces> getSpaces() {
        return this.spaces;
    }

    public ListDriveSpacesResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public ListDriveSpacesResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class ListDriveSpacesResponseBodySpaces extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2016-02-28T10:47:08Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>2016-02-28T10:47:08Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <strong>example:</strong>
         * <p>acl</p>
         */
        @NameInMap("PermissionMode")
        public String permissionMode;

        /**
         * <strong>example:</strong>
         * <p>2147483648</p>
         */
        @NameInMap("Quota")
        public Long quota;

        /**
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("SpaceId")
        public String spaceId;

        @NameInMap("SpaceName")
        public String spaceName;

        /**
         * <strong>example:</strong>
         * <p>org</p>
         */
        @NameInMap("SpaceType")
        public String spaceType;

        /**
         * <strong>example:</strong>
         * <p>640445953</p>
         */
        @NameInMap("UsedQuota")
        public Long usedQuota;

        public static ListDriveSpacesResponseBodySpaces build(java.util.Map<String, ?> map) throws Exception {
            ListDriveSpacesResponseBodySpaces self = new ListDriveSpacesResponseBodySpaces();
            return TeaModel.build(map, self);
        }

        public ListDriveSpacesResponseBodySpaces setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListDriveSpacesResponseBodySpaces setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListDriveSpacesResponseBodySpaces setPermissionMode(String permissionMode) {
            this.permissionMode = permissionMode;
            return this;
        }
        public String getPermissionMode() {
            return this.permissionMode;
        }

        public ListDriveSpacesResponseBodySpaces setQuota(Long quota) {
            this.quota = quota;
            return this;
        }
        public Long getQuota() {
            return this.quota;
        }

        public ListDriveSpacesResponseBodySpaces setSpaceId(String spaceId) {
            this.spaceId = spaceId;
            return this;
        }
        public String getSpaceId() {
            return this.spaceId;
        }

        public ListDriveSpacesResponseBodySpaces setSpaceName(String spaceName) {
            this.spaceName = spaceName;
            return this;
        }
        public String getSpaceName() {
            return this.spaceName;
        }

        public ListDriveSpacesResponseBodySpaces setSpaceType(String spaceType) {
            this.spaceType = spaceType;
            return this;
        }
        public String getSpaceType() {
            return this.spaceType;
        }

        public ListDriveSpacesResponseBodySpaces setUsedQuota(Long usedQuota) {
            this.usedQuota = usedQuota;
            return this;
        }
        public Long getUsedQuota() {
            return this.usedQuota;
        }

    }

}
