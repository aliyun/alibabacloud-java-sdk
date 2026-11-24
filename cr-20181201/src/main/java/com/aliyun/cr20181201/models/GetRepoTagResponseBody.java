// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetRepoTagResponseBody extends TeaModel {
    /**
     * <p>The return code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The digest value.</p>
     * 
     * <strong>example:</strong>
     * <p>67bfbcc12b67936ec7f867927817cbb071832b873dbcaed312a1930ba5f1****</p>
     */
    @NameInMap("Digest")
    public String digest;

    /**
     * <p>The time when the image was created.</p>
     * 
     * <strong>example:</strong>
     * <p>1572839125000</p>
     */
    @NameInMap("ImageCreate")
    public Long imageCreate;

    /**
     * <p>The image ID.</p>
     * 
     * <strong>example:</strong>
     * <p>45023655bf39c382e26a8607d057c27871dee163c1ecf48cc1ebf2a1****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The size of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>27107966</p>
     */
    @NameInMap("ImageSize")
    public Long imageSize;

    /**
     * <p>The time when the image was last updated. This value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1572875608000</p>
     */
    @NameInMap("ImageUpdate")
    public Long imageUpdate;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>031572FA-7D8F-4C05-B790-1071E0E05DE6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the image. Valid values:</p>
     * <ul>
     * <li><p><code>NORMAL</code>: Normal.</p>
     * </li>
     * <li><p><code>DELETING</code>: The image is being deleted.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The repository tag.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("Tag")
    public String tag;

    public static GetRepoTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRepoTagResponseBody self = new GetRepoTagResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRepoTagResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRepoTagResponseBody setDigest(String digest) {
        this.digest = digest;
        return this;
    }
    public String getDigest() {
        return this.digest;
    }

    public GetRepoTagResponseBody setImageCreate(Long imageCreate) {
        this.imageCreate = imageCreate;
        return this;
    }
    public Long getImageCreate() {
        return this.imageCreate;
    }

    public GetRepoTagResponseBody setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public GetRepoTagResponseBody setImageSize(Long imageSize) {
        this.imageSize = imageSize;
        return this;
    }
    public Long getImageSize() {
        return this.imageSize;
    }

    public GetRepoTagResponseBody setImageUpdate(Long imageUpdate) {
        this.imageUpdate = imageUpdate;
        return this;
    }
    public Long getImageUpdate() {
        return this.imageUpdate;
    }

    public GetRepoTagResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public GetRepoTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRepoTagResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetRepoTagResponseBody setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}
