// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class UpdateInstanceImageRequest extends TeaModel {
    /**
     * <p>Specifies whether to skip parameter validation. A value of true indicates that validation is skipped. A value of false or an empty value indicates that validation is performed.</p>
     */
    @NameInMap("IgnoreParamValidation")
    public Boolean ignoreParamValidation;

    /**
     * <p>The image ID. You can call the <a href="https://help.aliyun.com/document_detail/2807324.html">DescribeImageList</a> operation to query the image list of cloud phones.</p>
     * 
     * <strong>example:</strong>
     * <p>imgc-075cllfeuazh0****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The list of instances.</p>
     */
    @NameInMap("InstanceIdList")
    public java.util.List<String> instanceIdList;

    /**
     * <p>Specifies whether to reset the instance. A reset clears all user data on the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Reset")
    public Boolean reset;

    public static UpdateInstanceImageRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceImageRequest self = new UpdateInstanceImageRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceImageRequest setIgnoreParamValidation(Boolean ignoreParamValidation) {
        this.ignoreParamValidation = ignoreParamValidation;
        return this;
    }
    public Boolean getIgnoreParamValidation() {
        return this.ignoreParamValidation;
    }

    public UpdateInstanceImageRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public UpdateInstanceImageRequest setInstanceIdList(java.util.List<String> instanceIdList) {
        this.instanceIdList = instanceIdList;
        return this;
    }
    public java.util.List<String> getInstanceIdList() {
        return this.instanceIdList;
    }

    public UpdateInstanceImageRequest setReset(Boolean reset) {
        this.reset = reset;
        return this;
    }
    public Boolean getReset() {
        return this.reset;
    }

}
