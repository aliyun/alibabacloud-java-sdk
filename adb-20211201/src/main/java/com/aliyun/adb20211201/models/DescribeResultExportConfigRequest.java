// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeResultExportConfigRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the information about all AnalyticDB for MySQL clusters within a region, including cluster IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-8vbf80pjcz*****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The export type. Valid values:</p>
     * <ul>
     * <li>SLS: Indicates that the export destination is SLS.</li>
     * <li>OSS: Indicates that the export destination is OSS.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SLS</p>
     */
    @NameInMap("ExportType")
    public String exportType;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeResultExportConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResultExportConfigRequest self = new DescribeResultExportConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeResultExportConfigRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeResultExportConfigRequest setExportType(String exportType) {
        this.exportType = exportType;
        return this;
    }
    public String getExportType() {
        return this.exportType;
    }

    public DescribeResultExportConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
