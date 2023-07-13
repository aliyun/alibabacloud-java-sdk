// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListImagesRequest extends TeaModel {
    /**
     * <p>The image tag of the operating system. The tag is used only for management nodes.</p>
     */
    @NameInMap("BaseOsTag")
    public String baseOsTag;

    /**
     * <p>The instance type.</p>
     * <br>
     * <p>*   If a value is passed to the parameter, the list of images that are supported by the specified instance type is queried.</p>
     * <p>*   If no value is passed to the parameter, the list of images that are supported by all instance types is queried.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    public static ListImagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListImagesRequest self = new ListImagesRequest();
        return TeaModel.build(map, self);
    }

    public ListImagesRequest setBaseOsTag(String baseOsTag) {
        this.baseOsTag = baseOsTag;
        return this;
    }
    public String getBaseOsTag() {
        return this.baseOsTag;
    }

    public ListImagesRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

}
