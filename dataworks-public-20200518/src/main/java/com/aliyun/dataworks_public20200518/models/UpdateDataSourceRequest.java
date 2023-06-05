// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateDataSourceRequest extends TeaModel {
    /**
     * <p>The ID of the data source that you want to update. You can call the [ListDataSources](~~211431~~) operation to obtain the ID.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>Indicates whether the data source is updated.</p>
     */
    @NameInMap("DataSourceId")
    public Long dataSourceId;

    /**
     * <p>The details about the data source that you want to update.</p>
     * <br>
     * <p>You are not allowed to change the type of the data source. For example, you are not allowed to change the data source type from MaxCompute to mysql.</p>
     * <br>
     * <p>Examples of details of some common data sources:</p>
     * <br>
     * <p>*   odps</p>
     * <br>
     * <p>```</p>
     * <br>
     * <p>{</p>
     * <p>  "accessId": "xssssss",</p>
     * <p>  "accessKey": "xsaxsaxsa",</p>
     * <p>  "authType": 2,</p>
     * <p>  "endpoint": "http://service.odps.aliyun.com/api",</p>
     * <p>  "project": "xsaxsax",</p>
     * <p>  "tag": "public"</p>
     * <p>}</p>
     * <p>                                </p>
     * <p>```</p>
     * <br>
     * <p>*   mysql</p>
     * <br>
     * <p>```</p>
     * <br>
     * <p>{</p>
     * <p>  "database": "xsaxsa",</p>
     * <p>  "instanceName": "rm-xsaxsa",</p>
     * <p>  "password": "xsaxsa",</p>
     * <p>  "rdsOwnerId": "xasxsa",</p>
     * <p>  "regionId": "cn-shanghai",</p>
     * <p>  "tag": "rds",</p>
     * <p>  "username": "xsaxsa"</p>
     * <p>}</p>
     * <p>                                </p>
     * <p>```</p>
     * <br>
     * <p>*   rds</p>
     * <br>
     * <p>```</p>
     * <br>
     * <p>{</p>
     * <p>  "configType": 1,</p>
     * <p>  "tag": "rds",</p>
     * <p>  "database": "xsaxsa",</p>
     * <p>  "username": "xsaxsa",</p>
     * <p>  "password": "xssaxsa$32050",</p>
     * <p>  "instanceName": "rm-xsaxs",</p>
     * <p>  "rdsOwnerId": "11111111"</p>
     * <p>}</p>
     * <p>                                </p>
     * <p>```</p>
     * <br>
     * <p>*   oss</p>
     * <br>
     * <p>```</p>
     * <br>
     * <p>{</p>
     * <p>  "accessId": "sssssxx",</p>
     * <p>  "accessKey": "xsaxaxsaxs",</p>
     * <p>  "bucket": "xsa-xs-xs",</p>
     * <p>  "endpoint": "http://oss-cn-shanghai.aliyuncs.com",</p>
     * <p>  "tag": "public"</p>
     * <p>}</p>
     * <p>                                </p>
     * <p>```</p>
     * <br>
     * <p>*   sqlserver</p>
     * <br>
     * <p>```</p>
     * <br>
     * <p>{</p>
     * <p>  "jdbcUrl": "jdbc:sqlserver://xsaxsa-xsaxsa.database.xxx.cnv:123;DatabaseName=xsxs-xsxs",</p>
     * <p>  "password": "sdasda$fs",</p>
     * <p>  "tag": "public",</p>
     * <p>  "username": "sxaxacdacdd"</p>
     * <p>}</p>
     * <p>                                </p>
     * <p>```</p>
     * <br>
     * <p>*   polardb</p>
     * <br>
     * <p>```</p>
     * <br>
     * <p>{</p>
     * <p>  "clusterId": "pc-sdadsadsa",</p>
     * <p>  "database": "dsadsadsa",</p>
     * <p>  "ownerId": "121212122",</p>
     * <p>  "password": "sdasdafssa",</p>
     * <p>  "region": "cn-shanghai",</p>
     * <p>  "tag": "polardb",</p>
     * <p>  "username": "asdadsads"</p>
     * <p>}</p>
     * <p>                                </p>
     * <p>```</p>
     * <br>
     * <p>*   oracle</p>
     * <br>
     * <p>```</p>
     * <br>
     * <p>{</p>
     * <p>  "jdbcUrl": "jdbc:oracle:saaa:@xxxxx:1521:PROD",</p>
     * <p>  "password": "sxasaxsa",</p>
     * <p>  "tag": "public",</p>
     * <p>  "username": "sasfadfa"</p>
     * <p>}</p>
     * <p>                                </p>
     * <p>```</p>
     * <br>
     * <p>*   mongodb</p>
     * <br>
     * <p>```</p>
     * <br>
     * <p>{</p>
     * <p>  "address": "[\"xsaxxsa.mongodb.rds.aliyuncs.com:3717\"]",</p>
     * <p>  "database": "admin",</p>
     * <p>  "password": "sadsda@",</p>
     * <p>  "tag": "public",</p>
     * <p>  "username": "dsadsadas"</p>
     * <p>}</p>
     * <p>                                </p>
     * <p>```</p>
     * <br>
     * <p>*   emr</p>
     * <br>
     * <p>```</p>
     * <br>
     * <p>{</p>
     * <p>  "accessId": "xsaxsa",</p>
     * <p>  "emrClusterId": "C-dsads",</p>
     * <p>  "emrResourceQueueName": "default",</p>
     * <p>  "emrEndpoint": "emr.aliyuncs.com",</p>
     * <p>  "accessKey": "dsadsad",</p>
     * <p>  "emrUserId": "224833315798889783",</p>
     * <p>  "name": "sasdsadsa",</p>
     * <p>  "emrAccessMode": "simple",</p>
     * <p>  "region": "cn-shanghai",</p>
     * <p>  "authType": "2",</p>
     * <p>  "emrProjectId": "FP-sdadsad"</p>
     * <p>}</p>
     * <p>                                </p>
     * <p>```</p>
     * <br>
     * <p>*   postgresql</p>
     * <br>
     * <p>```</p>
     * <br>
     * <p>{</p>
     * <p>  "jdbcUrl": "jdbc:postgresql://xxxx:1921/ssss",</p>
     * <p>  "password": "sdadsads",</p>
     * <p>  "tag": "public",</p>
     * <p>  "username": "sdsasda"</p>
     * <p>}</p>
     * <p>                                </p>
     * <p>```</p>
     * <br>
     * <p>*   analyticdb_for_mysql</p>
     * <br>
     * <p>```</p>
     * <br>
     * <p>{</p>
     * <p>  "instanceId": "am-sadsada",</p>
     * <p>  "database": "xsxsx",</p>
     * <p>  "username": "xsxsa",</p>
     * <p>  "password": "asdadsa",</p>
     * <p>  "connectionString": "am-xssxsxs.ads.aliyuncs.com:3306"</p>
     * <p>}</p>
     * <p>                                </p>
     * <p>```</p>
     * <br>
     * <p>*   hybriddb_for_postgresql</p>
     * <br>
     * <p>```</p>
     * <br>
     * <p>{</p>
     * <p>  "connectionString": "gp-xsaxsaxa-master.gpdbmaster.rds.aliyuncs.com",</p>
     * <p>  "database": "xsaxsaxas",</p>
     * <p>  "password": "xsaxsaxsa@11",</p>
     * <p>  "instanceId": "gp-xsaxsaxsa",</p>
     * <p>  "port": "541132",</p>
     * <p>  "ownerId": "xsaxsaxsas",</p>
     * <p>  "username": "sadsad"</p>
     * <p>}</p>
     * <p>                                </p>
     * <p>```</p>
     * <br>
     * <p>*   holo</p>
     * <br>
     * <p>```</p>
     * <br>
     * <p>{</p>
     * <p>  "accessId": "xsaxsaxs",</p>
     * <p>  "accessKey": "xsaxsaxsa",</p>
     * <p>  "database": "xsaxsaxsa",</p>
     * <p>  "instanceId": "xsaxa",</p>
     * <p>  "tag": "aliyun"</p>
     * <p>}</p>
     * <p>                                </p>
     * <p>```</p>
     * <br>
     * <p>*   kafka</p>
     * <br>
     * <p>```</p>
     * <br>
     * <p>{</p>
     * <p>  "instanceId": "xsax-cn-xsaxsa",</p>
     * <p>  "regionId": "cn-shanghai",</p>
     * <p>  "tag": "aliyun",</p>
     * <p>  "ownerId": "1212121212112"</p>
     * <p>}</p>
     * <p>                                </p>
     * <p>```</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The status of the data source. The parameter is deprecated. Do not use this parameter.</p>
     */
    @NameInMap("EnvType")
    public Integer envType;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("Status")
    public String status;

    public static UpdateDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataSourceRequest self = new UpdateDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataSourceRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateDataSourceRequest setDataSourceId(Long dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public Long getDataSourceId() {
        return this.dataSourceId;
    }

    public UpdateDataSourceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDataSourceRequest setEnvType(Integer envType) {
        this.envType = envType;
        return this;
    }
    public Integer getEnvType() {
        return this.envType;
    }

    public UpdateDataSourceRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
