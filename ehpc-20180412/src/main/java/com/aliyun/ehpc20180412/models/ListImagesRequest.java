// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListImagesRequest extends TeaModel {
    /**
     * <p>The image tag of the operating system. The tag is used only for management nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>CentOS_7.2_64</p>
     */
    @NameInMap("BaseOsTag")
    public String baseOsTag;

    /**
     * <p>The instance type.</p>
     * <ul>
     * <li>If a value is passed to the parameter, the list of images that are supported by the specified instance type is queried.</li>
     * <li>If no value is passed to the parameter, the list of images that are supported by all instance types is queried.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ecs.n1.medium</p>
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
