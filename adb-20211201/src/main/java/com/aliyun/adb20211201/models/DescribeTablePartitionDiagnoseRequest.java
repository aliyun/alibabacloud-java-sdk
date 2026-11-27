// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeTablePartitionDiagnoseRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp171g24yvbxxxxx</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Specifies the language of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * <li><strong>ja</strong>: Japanese</li>
     * <li><strong>zh-tw</strong>: Traditional Chinese</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Sorts the query results by a specified field. The value must be a JSON string. Example: <code>[{&quot;Field&quot;:&quot;TotalSize&quot;,&quot;Type&quot;:&quot;Desc&quot;}]</code>. The JSON string contains the following parameters:</p>
     * <ul>
     * <li><code>Field</code>: the field by which to sort the results. Valid values:<ul>
     * <li><code>SchemaName</code>: the name of the database to which the table belongs.</li>
     * <li><code>TableName</code>: the table name.</li>
     * <li><code>TotalSize</code>: the total data volume.</li>
     * <li><code>SpaceRatio</code>: the storage space proportion.</li>
     * </ul>
     * </li>
     * <li><code>Type</code>: the sort order. Valid values:<ul>
     * <li><code>Asc</code>: ascending order.</li>
     * <li><code>Desc</code>: descending order.</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If this parameter is not specified, the results are sorted in descending order of the total data volume of the target table by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Field&quot;:&quot;TotalSize&quot;,&quot;Type&quot;:&quot;Desc&quot;}]</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeTablePartitionDiagnoseRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTablePartitionDiagnoseRequest self = new DescribeTablePartitionDiagnoseRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTablePartitionDiagnoseRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeTablePartitionDiagnoseRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeTablePartitionDiagnoseRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeTablePartitionDiagnoseRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTablePartitionDiagnoseRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTablePartitionDiagnoseRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
