// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class CompareSimilarByImageRequest extends TeaModel {
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
    public String primaryPicContent;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAANSUhEUgAAAPcAAAEVCAYAAAA8d3NuAAAAAXNSR0IArs......RK5CYII=</p>
     */
    @NameInMap("SecondaryPicContent")
    public String secondaryPicContent;

    public static CompareSimilarByImageRequest build(java.util.Map<String, ?> map) throws Exception {
        CompareSimilarByImageRequest self = new CompareSimilarByImageRequest();
        return TeaModel.build(map, self);
    }

    public CompareSimilarByImageRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CompareSimilarByImageRequest setPrimaryPicContent(String primaryPicContent) {
        this.primaryPicContent = primaryPicContent;
        return this;
    }
    public String getPrimaryPicContent() {
        return this.primaryPicContent;
    }

    public CompareSimilarByImageRequest setSecondaryPicContent(String secondaryPicContent) {
        this.secondaryPicContent = secondaryPicContent;
        return this;
    }
    public String getSecondaryPicContent() {
        return this.secondaryPicContent;
    }

}
