// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class BatchCreateVodPackagingAssetResponseBody extends TeaModel {
    /**
     * <p>The name of the packaging group.</p>
     * 
     * <strong>example:</strong>
     * <p>vod_hls</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The results of asset ingestion.</p>
     */
    @NameInMap("ResultList")
    public java.util.List<BatchCreateVodPackagingAssetResponseBodyResultList> resultList;

    public static BatchCreateVodPackagingAssetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateVodPackagingAssetResponseBody self = new BatchCreateVodPackagingAssetResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchCreateVodPackagingAssetResponseBody setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public BatchCreateVodPackagingAssetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchCreateVodPackagingAssetResponseBody setResultList(java.util.List<BatchCreateVodPackagingAssetResponseBodyResultList> resultList) {
        this.resultList = resultList;
        return this;
    }
    public java.util.List<BatchCreateVodPackagingAssetResponseBodyResultList> getResultList() {
        return this.resultList;
    }

    public static class BatchCreateVodPackagingAssetResponseBodyResultList extends TeaModel {
        /**
         * <p>The information about the ingested asset.</p>
         */
        @NameInMap("Asset")
        public VodPackagingAsset asset;

        /**
         * <p>The error code for failed ingestion.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter.PackagingAssetAlreadyExists</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The error message for failed ingestion.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified packagingAsset &quot;inputMovie&quot; already exists</p>
         */
        @NameInMap("Message")
        public String message;

        public static BatchCreateVodPackagingAssetResponseBodyResultList build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateVodPackagingAssetResponseBodyResultList self = new BatchCreateVodPackagingAssetResponseBodyResultList();
            return TeaModel.build(map, self);
        }

        public BatchCreateVodPackagingAssetResponseBodyResultList setAsset(VodPackagingAsset asset) {
            this.asset = asset;
            return this;
        }
        public VodPackagingAsset getAsset() {
            return this.asset;
        }

        public BatchCreateVodPackagingAssetResponseBodyResultList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public BatchCreateVodPackagingAssetResponseBodyResultList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
