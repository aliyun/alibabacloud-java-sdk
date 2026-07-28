// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListResourcesRequest extends TeaModel {
    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of results per page. Default value: 20. Minimum value: 1. Maximum value: 200.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The type of the resource source. Valid values:</p>
     * <ul>
     * <li><p>ExportTaskId: resource export ID</p>
     * </li>
     * <li><p>TaskId: Module execution task ID</p>
     * </li>
     * <li><p>StatePath: the OSS path where the resource state is stored.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TaskId</p>
     */
    @NameInMap("sourceType")
    public String sourceType;

    /**
     * <p>The specific value of the resource source.</p>
     * <ul>
     * <li><p>If sourceType is set to ExportTaskId, the format is ExportTaskId:Version.</p>
     * </li>
     * <li><p>If sourceType is set to TaskId, the format is TaskId.</p>
     * </li>
     * <li><p>If sourceType is set to StatePath, the format is the download URL of the State file.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>task-235436dsfdgd</p>
     */
    @NameInMap("sourceValue")
    public String sourceValue;

    /**
     * <p>The specification that resource properties follow in the response. Valid values: CloudSpec, Terraform.
     * Default value: CloudSpec.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudSpec</p>
     */
    @NameInMap("specType")
    public String specType;

    public static ListResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourcesRequest self = new ListResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListResourcesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListResourcesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListResourcesRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public ListResourcesRequest setSourceValue(String sourceValue) {
        this.sourceValue = sourceValue;
        return this;
    }
    public String getSourceValue() {
        return this.sourceValue;
    }

    public ListResourcesRequest setSpecType(String specType) {
        this.specType = specType;
        return this;
    }
    public String getSpecType() {
        return this.specType;
    }

}
