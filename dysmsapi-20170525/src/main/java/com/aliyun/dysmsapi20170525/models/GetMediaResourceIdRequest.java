// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class GetMediaResourceIdRequest extends TeaModel {
    /**
     * <p>The extended field.</p>
     * <blockquote>
     * <p>Required when the resource type is <strong>image</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;img_rate\&quot;:\&quot;oneToOne\&quot;}</p>
     */
    @NameInMap("ExtendInfo")
    public String extendInfo;

    /**
     * <p>The file size. Unit: bytes.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("FileSize")
    public Long fileSize;

    /**
     * <p>The description of the uploaded resource.</p>
     * 
     * <strong>example:</strong>
     * <p>图片信息</p>
     */
    @NameInMap("Memo")
    public String memo;

    /**
     * <p>The address of the resource to retrieve.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://alicom-fc-media/1947741454322274/alicom-fc-media/pic/202205191526575398603697152.png</p>
     */
    @NameInMap("OssKey")
    public String ossKey;

    /**
     * <p>The resource type.</p>
     * <ul>
     * <li><strong>1</strong>: Text</li>
     * <li><strong>2</strong>: Image. Small images must not exceed 100 KB. Large images must not exceed 2 MB. Images must be clear. Supported formats: JPG, JPEG, PNG.</li>
     * <li><strong>3</strong>: Audio</li>
     * <li><strong>4</strong>: Video. Supported format: MP4.<blockquote>
     * <ul>
     * <li>If the resource type is image, <strong>img_rate</strong> is required.</li>
     * <li>1:1 ratio: oneToOne</li>
     * <li>16:9 ratio: sixteenToNine</li>
     * <li>3:1 ratio: threeToOne</li>
     * <li>48:65 ratio: fortyEightToSixtyFiv.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ResourceType")
    public Integer resourceType;

    public static GetMediaResourceIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMediaResourceIdRequest self = new GetMediaResourceIdRequest();
        return TeaModel.build(map, self);
    }

    public GetMediaResourceIdRequest setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public String getExtendInfo() {
        return this.extendInfo;
    }

    public GetMediaResourceIdRequest setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Long getFileSize() {
        return this.fileSize;
    }

    public GetMediaResourceIdRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public GetMediaResourceIdRequest setOssKey(String ossKey) {
        this.ossKey = ossKey;
        return this;
    }
    public String getOssKey() {
        return this.ossKey;
    }

    public GetMediaResourceIdRequest setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public Integer getResourceType() {
        return this.resourceType;
    }

}
