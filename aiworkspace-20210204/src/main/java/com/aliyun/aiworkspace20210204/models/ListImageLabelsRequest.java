// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListImageLabelsRequest extends TeaModel {
    /**
     * <p>The image ID. You can call <a href="https://help.aliyun.com/document_detail/449118.html">ListImages</a> to obtain the image ID.</p>
     * 
     * <strong>example:</strong>
     * <p>image-4c62******53uor</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The tag filter conditions, separated with commas (,). The format of a single condition filter is <code>key=value</code>. Takes effect independently from LabelKeys.</p>
     * 
     * <strong>example:</strong>
     * <p>system.framework=XGBoost 1.6.0,system.official=true</p>
     */
    @NameInMap("LabelFilter")
    public String labelFilter;

    /**
     * <p>The tag keys, separated with commas (,). System tags start with system and take effect independently from LabelFilter.</p>
     * 
     * <strong>example:</strong>
     * <p>system.framework,system.official</p>
     */
    @NameInMap("LabelKeys")
    public String labelKeys;

    /**
     * <p>The region where the image resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The workspace ID. You can call <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> to obtain the workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListImageLabelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListImageLabelsRequest self = new ListImageLabelsRequest();
        return TeaModel.build(map, self);
    }

    public ListImageLabelsRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ListImageLabelsRequest setLabelFilter(String labelFilter) {
        this.labelFilter = labelFilter;
        return this;
    }
    public String getLabelFilter() {
        return this.labelFilter;
    }

    public ListImageLabelsRequest setLabelKeys(String labelKeys) {
        this.labelKeys = labelKeys;
        return this;
    }
    public String getLabelKeys() {
        return this.labelKeys;
    }

    public ListImageLabelsRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ListImageLabelsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
