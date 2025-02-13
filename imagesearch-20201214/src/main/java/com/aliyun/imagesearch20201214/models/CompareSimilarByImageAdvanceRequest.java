// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class CompareSimilarByImageAdvanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demoinstance1</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAANSUhEUgAAAPcAAAEVCAYAAAA8d3NuAAAAAXNSR0IArs......RK5CYII=</p>
     */
    @NameInMap("PrimaryPicContent")
    public java.io.InputStream primaryPicContentObject;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAANSUhEUgAAAPcAAAEVCAYAAAA8d3NuAAAAAXNSR0IArs......RK5CYII=</p>
     */
    @NameInMap("SecondaryPicContent")
    public java.io.InputStream secondaryPicContentObject;

    public static CompareSimilarByImageAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CompareSimilarByImageAdvanceRequest self = new CompareSimilarByImageAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public CompareSimilarByImageAdvanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CompareSimilarByImageAdvanceRequest setPrimaryPicContentObject(java.io.InputStream primaryPicContentObject) {
        this.primaryPicContentObject = primaryPicContentObject;
        return this;
    }
    public java.io.InputStream getPrimaryPicContentObject() {
        return this.primaryPicContentObject;
    }

    public CompareSimilarByImageAdvanceRequest setSecondaryPicContentObject(java.io.InputStream secondaryPicContentObject) {
        this.secondaryPicContentObject = secondaryPicContentObject;
        return this;
    }
    public java.io.InputStream getSecondaryPicContentObject() {
        return this.secondaryPicContentObject;
    }

}
