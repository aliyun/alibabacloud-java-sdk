// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class GetMediaResourceIdRequest extends TeaModel {
    /**
     * <p>The extended fields.</p>
     * <blockquote>
     * <p>If you set the ResourceType parameter to <strong>2</strong>, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;img_rate\&quot;:\&quot;oneToOne\&quot;}</p>
     */
    @NameInMap("ExtendInfo")
    public String extendInfo;

    /**
     * <p>The size of the resource. Unit: bytes.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("FileSize")
    public Long fileSize;

    /**
     * <p>The description of the resource.</p>
     */
    @NameInMap("Memo")
    public String memo;

    /**
     * <p>The address of the resource.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://alicom-fc-media/1947741454322274/alicom-fc-media/pic/202205191526575398603697152.png</p>
     */
    @NameInMap("OssKey")
    public String ossKey;

    /**
     * <p>The type of the resource.</p>
     * <ul>
     * <li><strong>1</strong>: text.</li>
     * <li><strong>2</strong>: image. A small image cannot exceed 100 KB in size, and a large image cannot exceed 2 MB in size. The image must be clear. Supported format: JPG, JPEG, and PNG.</li>
     * <li><strong>3</strong>: audio.</li>
     * <li><strong>4</strong>: video. Supported format: MP4.</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If you set the ResourceType parameter to 2, the <strong>img_rate</strong> required is required. Valid values:</p>
     * </li>
     * <li><p>1:1</p>
     * </li>
     * <li><p>16:9</p>
     * </li>
     * <li><p>3:1</p>
     * </li>
     * <li><p>48:65</p>
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
