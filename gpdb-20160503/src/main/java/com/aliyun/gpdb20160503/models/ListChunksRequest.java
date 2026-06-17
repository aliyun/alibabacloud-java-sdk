// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListChunksRequest extends TeaModel {
    /**
     * <p>The name of the document collection.</p>
     * <blockquote>
     * <p>A document collection is created by calling the <a href="https://help.aliyun.com/document_detail/2618448.html">CreateDocumentCollection</a> operation. You can call the <a href="https://help.aliyun.com/document_detail/2618452.html">ListDocumentCollections</a> operation to query the created document collections.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testcollection</p>
     */
    @NameInMap("Collection")
    public String collection;

    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the details of all AnalyticDB for PostgreSQL instances in a specific region, including the instance IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The name of the file.</p>
     * <blockquote>
     * <p>The name of an uploaded file. You can call the <a href="https://help.aliyun.com/document_detail/2618453.html">ListDocuments</a> operation to query the file list.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>mydoc.txt</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The filter conditions for the data to be queried. The format is the same as the WHERE clause in SQL. It is an expression that returns a Boolean value. The conditions can be simple comparison operators, such as equal to (=), not equal to (&lt;&gt; or !=), greater than (&gt;), less than (&lt;), greater than or equal to (&gt;=), and less than or equal to (&lt;=). They can also be more complex expressions that are combined with logical operators (AND, OR, and NOT), and conditions that use keywords such as IN, BETWEEN, and LIKE.</p>
     * <blockquote>
     * <ul>
     * <li>For more information about the syntax, see <a href="https://www.postgresqltutorial.com/postgresql-tutorial/postgresql-where/">PostgreSQL WHERE</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>title = \&quot;test\&quot; AND name like \&quot;test%\&quot;</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>Specifies whether to return vectors. Default value: false.</p>
     * <blockquote>
     * <ul>
     * <li><p><strong>false</strong>: Vectors are not returned.</p>
     * </li>
     * <li><p><strong>true</strong>: Vectors are returned.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeVector")
    public Boolean includeVector;

    /**
     * <p>The name of the namespace. Default value: public.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2401495.html">CreateNamespace</a> operation to create a namespace or call the <a href="https://help.aliyun.com/document_detail/2401502.html">ListNamespaces</a> operation to query a list of namespaces.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>mynamespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The password of the namespace.</p>
     * <blockquote>
     * <p>This parameter is specified when you call the <a href="https://help.aliyun.com/document_detail/2401495.html">CreateNamespace</a> operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testpassword</p>
     */
    @NameInMap("NamespacePassword")
    public String namespacePassword;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <ul>
     * <li><p><strong>20</strong></p>
     * </li>
     * <li><p><strong>50</strong></p>
     * </li>
     * <li><p><strong>100</strong></p>
     * </li>
     * </ul>
     * <p>Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListChunksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListChunksRequest self = new ListChunksRequest();
        return TeaModel.build(map, self);
    }

    public ListChunksRequest setCollection(String collection) {
        this.collection = collection;
        return this;
    }
    public String getCollection() {
        return this.collection;
    }

    public ListChunksRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ListChunksRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public ListChunksRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListChunksRequest setIncludeVector(Boolean includeVector) {
        this.includeVector = includeVector;
        return this;
    }
    public Boolean getIncludeVector() {
        return this.includeVector;
    }

    public ListChunksRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListChunksRequest setNamespacePassword(String namespacePassword) {
        this.namespacePassword = namespacePassword;
        return this;
    }
    public String getNamespacePassword() {
        return this.namespacePassword;
    }

    public ListChunksRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListChunksRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListChunksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
