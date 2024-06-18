// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetConversaionSpaceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("space")
    public GetConversaionSpaceResponseBodySpace space;

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

    public static GetConversaionSpaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConversaionSpaceResponseBody self = new GetConversaionSpaceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConversaionSpaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetConversaionSpaceResponseBody setSpace(GetConversaionSpaceResponseBodySpace space) {
        this.space = space;
        return this;
    }
    public GetConversaionSpaceResponseBodySpace getSpace() {
        return this.space;
    }

    public GetConversaionSpaceResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public GetConversaionSpaceResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class GetConversaionSpaceResponseBodySpace extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ding1234xxxxx</p>
         */
        @NameInMap("CorpId")
        public String corpId;

        /**
         * <strong>example:</strong>
         * <p>2022-01-01T10:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>2022-01-01T10:00:00Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <strong>example:</strong>
         * <p>798xxxxx</p>
         */
        @NameInMap("SpaceId")
        public String spaceId;

        public static GetConversaionSpaceResponseBodySpace build(java.util.Map<String, ?> map) throws Exception {
            GetConversaionSpaceResponseBodySpace self = new GetConversaionSpaceResponseBodySpace();
            return TeaModel.build(map, self);
        }

        public GetConversaionSpaceResponseBodySpace setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public GetConversaionSpaceResponseBodySpace setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetConversaionSpaceResponseBodySpace setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetConversaionSpaceResponseBodySpace setSpaceId(String spaceId) {
            this.spaceId = spaceId;
            return this;
        }
        public String getSpaceId() {
            return this.spaceId;
        }

    }

}
