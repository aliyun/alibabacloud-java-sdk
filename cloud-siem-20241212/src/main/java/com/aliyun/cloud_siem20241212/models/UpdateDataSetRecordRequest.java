// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateDataSetRecordRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cloudsiem-dataset/1358117679873357_174338773****.csv</p>
     */
    @NameInMap("DataSetFileName")
    public String dataSetFileName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dataset-10iy8mbifnb4gniv****</p>
     */
    @NameInMap("DataSetId")
    public String dataSetId;

    /**
     * <strong>example:</strong>
     * <p>[{\&quot;ip\&quot;:\&quot;1.1.1.1\&quot;,\&quot;userid\&quot;:\&quot;1234\&quot;,\&quot;name\&quot;:\&quot;a12401\&quot;},
     *  {\&quot;ip\&quot;:\&quot;2.2.2.2\&quot;,\&quot;userid\&quot;:\&quot;33333\&quot;,\&quot;name\&quot;:\&quot;a12401\&quot;}]</p>
     */
    @NameInMap("DataSetRecords")
    public String dataSetRecords;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    public static UpdateDataSetRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataSetRecordRequest self = new UpdateDataSetRecordRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataSetRecordRequest setDataSetFileName(String dataSetFileName) {
        this.dataSetFileName = dataSetFileName;
        return this;
    }
    public String getDataSetFileName() {
        return this.dataSetFileName;
    }

    public UpdateDataSetRecordRequest setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
        return this;
    }
    public String getDataSetId() {
        return this.dataSetId;
    }

    public UpdateDataSetRecordRequest setDataSetRecords(String dataSetRecords) {
        this.dataSetRecords = dataSetRecords;
        return this;
    }
    public String getDataSetRecords() {
        return this.dataSetRecords;
    }

    public UpdateDataSetRecordRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateDataSetRecordRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateDataSetRecordRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
