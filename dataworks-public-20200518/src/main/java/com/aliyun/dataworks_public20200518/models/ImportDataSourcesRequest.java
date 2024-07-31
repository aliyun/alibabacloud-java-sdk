// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ImportDataSourcesRequest extends TeaModel {
    /**
     * <p>The configurations of the data sources that you want to import. The Name, DataSourceType, SubType, Description, Content, and EnvType parameters are required. For more information about the parameters, see <a href="https://help.aliyun.com/document_detail/211429.html">CreateDataSource</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;SubType&quot;:&quot;&quot;,&quot;DataSourceType&quot;:&quot;mysql&quot;,&quot;EnvType&quot;:1,&quot;Name&quot;:&quot;mysql_dms2&quot;,&quot;Description&quot;:&quot;aaa&quot;,&quot;Content&quot;:&quot;{\&quot;database\&quot;:\&quot;mysql_chengdu_old\&quot;,\&quot;password\&quot;:\&quot;<em><strong>\&quot;,\&quot;instanceName\&quot;:\&quot;rm-2vcrckb37163g7l3w\&quot;,\&quot;regionId\&quot;:\&quot;cn-chengdu\&quot;,\&quot;tag\&quot;:\&quot;rds\&quot;,\&quot;rdsOwnerId\&quot;:\&quot;333\&quot;,\&quot;username\&quot;:\&quot;mysql_chengdu2\&quot;}&quot;},{&quot;SubType&quot;:&quot;&quot;,&quot;DataSourceType&quot;:&quot;mysql&quot;,&quot;EnvType&quot;:1,&quot;Name&quot;:&quot;mysql_dms2&quot;,&quot;Description&quot;:&quot;aaa&quot;,&quot;Content&quot;:&quot;{\&quot;database\&quot;:\&quot;mysql_chengdu_old\&quot;,\&quot;password\&quot;:\&quot;</strong></em>\&quot;,\&quot;instanceName\&quot;:\&quot;rm-2vcrckb37163g7l3w\&quot;,\&quot;regionId\&quot;:\&quot;cn-chengdu\&quot;,\&quot;tag\&quot;:\&quot;rds\&quot;,\&quot;rdsOwnerId\&quot;:\&quot;143\&quot;,\&quot;username\&quot;:\&quot;mysql_chengdu2\&quot;}&quot;}]</p>
     */
    @NameInMap("DataSources")
    public String dataSources;

    /**
     * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static ImportDataSourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportDataSourcesRequest self = new ImportDataSourcesRequest();
        return TeaModel.build(map, self);
    }

    public ImportDataSourcesRequest setDataSources(String dataSources) {
        this.dataSources = dataSources;
        return this;
    }
    public String getDataSources() {
        return this.dataSources;
    }

    public ImportDataSourcesRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
