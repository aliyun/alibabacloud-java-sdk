// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateJvmConfigurationRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c627c157-560d-*************</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the instance group where the application is deployed. You can call the ListDeployGroup operation to query the group ID. For more information, see <a href="https://help.aliyun.com/document_detail/62077.html">ListDeployGroup</a>.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>To configure the JVM parameters for an instance group, set this parameter to a specific ID.</p>
     * </li>
     * <li><p>To configure the JVM parameters for an application, leave this parameter empty.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0afc726e-077e-4357-98b2-db9f7145****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The maximum size of the heap memory. Unit: MB.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If this parameter is not specified in the group configuration, the value specified in the application configuration is used.</p>
     * </li>
     * <li><p>If this parameter is not specified in the application configuration, the default value is used.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("MaxHeapSize")
    public Integer maxHeapSize;

    /**
     * <p>The size of the permanent generation heap memory. Unit: MB.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If this parameter is not specified in the group configuration, the value specified in the application configuration is used.</p>
     * </li>
     * <li><p>If this parameter is not specified in the application configuration, the default value is used.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MaxPermSize")
    public Integer maxPermSize;

    /**
     * <p>The initial size of the heap memory. Unit: MB.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If this parameter is not specified in the group configuration, the value specified in the application configuration is used.</p>
     * </li>
     * <li><p>If this parameter is not specified in the application configuration, the default value is used.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("MinHeapSize")
    public Integer minHeapSize;

    /**
     * <p>The custom JVM parameters.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If this parameter is not specified in the group configuration, the value specified in the application configuration is used.</p>
     * </li>
     * <li><p>If this parameter is not specified in the application configuration, the default value is used.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>-Dproperty=value</p>
     */
    @NameInMap("Options")
    public String options;

    public static UpdateJvmConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateJvmConfigurationRequest self = new UpdateJvmConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateJvmConfigurationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateJvmConfigurationRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public UpdateJvmConfigurationRequest setMaxHeapSize(Integer maxHeapSize) {
        this.maxHeapSize = maxHeapSize;
        return this;
    }
    public Integer getMaxHeapSize() {
        return this.maxHeapSize;
    }

    public UpdateJvmConfigurationRequest setMaxPermSize(Integer maxPermSize) {
        this.maxPermSize = maxPermSize;
        return this;
    }
    public Integer getMaxPermSize() {
        return this.maxPermSize;
    }

    public UpdateJvmConfigurationRequest setMinHeapSize(Integer minHeapSize) {
        this.minHeapSize = minHeapSize;
        return this;
    }
    public Integer getMinHeapSize() {
        return this.minHeapSize;
    }

    public UpdateJvmConfigurationRequest setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

}
