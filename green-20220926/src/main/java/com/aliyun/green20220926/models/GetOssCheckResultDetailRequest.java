// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetOssCheckResultDetailRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>oss-tmp</p>
     */
    @NameInMap("Bucket")
    public String bucket;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MediaType")
    public Integer mediaType;

    /**
     * <strong>example:</strong>
     * <p>1748396909030.jpg</p>
     */
    @NameInMap("Object")
    public String object;

    @NameInMap("ParentTaskId")
    public String parentTaskId;

    /**
     * <strong>example:</strong>
     * <p>62E97001-1255-50A9-8E1E-4FD05473D952</p>
     */
    @NameInMap("QueryRequestId")
    public String queryRequestId;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>audio_media_detection_01</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    public static GetOssCheckResultDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOssCheckResultDetailRequest self = new GetOssCheckResultDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetOssCheckResultDetailRequest setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public GetOssCheckResultDetailRequest setMediaType(Integer mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public Integer getMediaType() {
        return this.mediaType;
    }

    public GetOssCheckResultDetailRequest setObject(String object) {
        this.object = object;
        return this;
    }
    public String getObject() {
        return this.object;
    }

    public GetOssCheckResultDetailRequest setParentTaskId(String parentTaskId) {
        this.parentTaskId = parentTaskId;
        return this;
    }
    public String getParentTaskId() {
        return this.parentTaskId;
    }

    public GetOssCheckResultDetailRequest setQueryRequestId(String queryRequestId) {
        this.queryRequestId = queryRequestId;
        return this;
    }
    public String getQueryRequestId() {
        return this.queryRequestId;
    }

    public GetOssCheckResultDetailRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetOssCheckResultDetailRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

}
