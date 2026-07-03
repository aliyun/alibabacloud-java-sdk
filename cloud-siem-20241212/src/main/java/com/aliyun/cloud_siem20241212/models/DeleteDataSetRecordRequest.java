// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class DeleteDataSetRecordRequest extends TeaModel {
    /**
     * <p>The ID of the dataset.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dataset-10iy8mbifnb4gniv****</p>
     */
    @NameInMap("DataSetId")
    public String dataSetId;

    /**
     * <p>A list of dataset record IDs in a JSON array format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[1,2,3,4]</p>
     */
    @NameInMap("DataSetRecordIds")
    public String dataSetRecordIds;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The region of the Data Management center for Threat Analysis. Select a region based on where your assets are located. Valid values:</p>
     * <ul>
     * <li><p>cn-hangzhou: Your assets are in the Chinese mainland.</p>
     * </li>
     * <li><p>ap-southeast-1: Your assets are outside China.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID of a member. An administrator can specify this parameter to operate as the member.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    public static DeleteDataSetRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataSetRecordRequest self = new DeleteDataSetRecordRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataSetRecordRequest setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
        return this;
    }
    public String getDataSetId() {
        return this.dataSetId;
    }

    public DeleteDataSetRecordRequest setDataSetRecordIds(String dataSetRecordIds) {
        this.dataSetRecordIds = dataSetRecordIds;
        return this;
    }
    public String getDataSetRecordIds() {
        return this.dataSetRecordIds;
    }

    public DeleteDataSetRecordRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteDataSetRecordRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteDataSetRecordRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
