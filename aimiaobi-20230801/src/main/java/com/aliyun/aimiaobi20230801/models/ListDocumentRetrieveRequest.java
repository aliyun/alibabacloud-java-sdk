// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListDocumentRetrieveRequest extends TeaModel {
    /**
     * <p>Document type. Valid values: 0 (default): All types. 1: Government documents. 2: Important articles. 5: Policy interpretation. 6: Legal provisions. 7: Regulations and rules. 8: General Secretary.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ContentType")
    public String contentType;

    /**
     * <p>Search scope. Valid values: 1: Title only. 0: Full text (title and content). Default is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ElementScope")
    public String elementScope;

    /**
     * <p>End date of issuance in yyyy-MM-dd format.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-07-03</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>Maximum number of results to return.</p>
     * 
     * <strong>example:</strong>
     * <p>94</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Token for the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>cEoBWREAXdxaOyjq/cqAbg==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Issuing agency.</p>
     * 
     * <strong>example:</strong>
     * <p>国务院办公室</p>
     */
    @NameInMap("Office")
    public String office;

    /**
     * <p>Search condition.</p>
     * 
     * <strong>example:</strong>
     * <p>检索Query</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>Region. Enter a province or city, such as Jilin Province or Beijing Municipality.</p>
     * 
     * <strong>example:</strong>
     * <p>北京市</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>Source. Valid values: 0: Internal (within your organization). 1: External (outside your organization).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>Start date of issuance in yyyy-MM-dd format.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-10-10</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <ul>
     * <li><p>Secondary classification of document type.</p>
     * <ul>
     * <li><p>When the document type is an official document: -1: Other; 0: Resolution; 1: Decision; 2: Order; 3: Bulletin; 4: Public Notice; 5: Notice; 6: Opinion; 7: Notification; 8: Circular; 9: Report; 10: Request for Instructions; 11: Approval; 12: Motion; 13: Letter</p>
     * </li>
     * <li><p>14: Summary</p>
     * </li>
     * <li><p>When the article type is important articles: 1: important commentary 2: important theory 3: other articles</p>
     * </li>
     * <li><p>When the document genre is rules and regulations: 3: Administrative regulations 4: Supervisory regulations 5: Local regulations 7: Departmental rules 8: Others 9: Party constitution and regulations</p>
     * </li>
     * <li><p>When the article genre is a legal provision: 1: Constitution 2: Law 6: Judicial Interpretation</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SubContentType")
    public String subContentType;

    /**
     * <p>Supported classifications:</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Level 1 category</th>
     * <th>Level 2 category</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>National defense and international cooperation</td>
     * <td>National defense. Foreign affairs. Military affairs. Work related to Hong Kong, Macao, Taiwan, and overseas Chinese.</td>
     * </tr>
     * <tr>
     * <td>Comprehensive administration</td>
     * <td>The 20th National Congress of the Communist Party of China. Government transparency and supervision. Joint administration. Party building. Conferences and proposals. Government document management. Other administrative matters.</td>
     * </tr>
     * <tr>
     * <td>State Council organizational structure</td>
     * <td>State Council. General Office of the State Council. State Council agencies.</td>
     * </tr>
     * <tr>
     * <td>Administrative and market regulation</td>
     * <td>Administrative regulation. Credit regulation. Product quality supervision. Work safety supervision. Market regulation.</td>
     * </tr>
     * <tr>
     * <td>Economic management</td>
     * <td>National economy. Market economy. Economic system reform. State-owned asset supervision.</td>
     * </tr>
     * <tr>
     * <td>Finance, banking, commerce, and customs</td>
     * <td>Finance. Banking. Auditing. Commerce. Customs.</td>
     * </tr>
     * <tr>
     * <td>Personnel and social security</td>
     * <td>Personnel work. Population and family planning. Work related to women and children. Poverty alleviation. Disaster reduction and relief. Public services. Social welfare and assistance. Preferential treatment and resettlement. Social security.</td>
     * </tr>
     * <tr>
     * <td>Public security and social management</td>
     * <td>Public security. Safety. Justice. Fire control. Ethnic affairs. Religion.</td>
     * </tr>
     * <tr>
     * <td>Science, education, culture, and sports</td>
     * <td>Culture. Scientific and technological innovation. Education. Intellectual property. Press and publishing. Radio, television, and the Internet. Sports. Tourism.</td>
     * </tr>
     * <tr>
     * <td>Healthcare</td>
     * <td>Health. Medical care. Veterinary medicine.</td>
     * </tr>
     * <tr>
     * <td>Urban-rural development and industrial growth</td>
     * <td>Urban and rural development. Industry. Transportation.</td>
     * </tr>
     * <tr>
     * <td>Natural resources and environmental protection</td>
     * <td>Land and energy resources. Civil engineering. Meteorology. Environmental protection.</td>
     * </tr>
     * <tr>
     * <td>Agriculture, forestry, water resources, fisheries, and animal husbandry</td>
     * <td>Agriculture. Forestry. Water resources. Fisheries. Animal husbandry.</td>
     * </tr>
     * <tr>
     * <td>Others</td>
     * <td>Others.</td>
     * </tr>
     * </tbody></table>
     * 
     * <strong>example:</strong>
     * <p>国防和交流合作事务</p>
     */
    @NameInMap("SubjectClassify")
    public String subjectClassify;

    /**
     * <p>Document number.</p>
     * 
     * <strong>example:</strong>
     * <p>宁民规〔2020〕5号</p>
     */
    @NameInMap("WordSize")
    public String wordSize;

    /**
     * <p>Unique identifier of the Model Studio workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2782167.html">Get workspaceId</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListDocumentRetrieveRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDocumentRetrieveRequest self = new ListDocumentRetrieveRequest();
        return TeaModel.build(map, self);
    }

    public ListDocumentRetrieveRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public ListDocumentRetrieveRequest setElementScope(String elementScope) {
        this.elementScope = elementScope;
        return this;
    }
    public String getElementScope() {
        return this.elementScope;
    }

    public ListDocumentRetrieveRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public ListDocumentRetrieveRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDocumentRetrieveRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDocumentRetrieveRequest setOffice(String office) {
        this.office = office;
        return this;
    }
    public String getOffice() {
        return this.office;
    }

    public ListDocumentRetrieveRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ListDocumentRetrieveRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ListDocumentRetrieveRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ListDocumentRetrieveRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public ListDocumentRetrieveRequest setSubContentType(String subContentType) {
        this.subContentType = subContentType;
        return this;
    }
    public String getSubContentType() {
        return this.subContentType;
    }

    public ListDocumentRetrieveRequest setSubjectClassify(String subjectClassify) {
        this.subjectClassify = subjectClassify;
        return this;
    }
    public String getSubjectClassify() {
        return this.subjectClassify;
    }

    public ListDocumentRetrieveRequest setWordSize(String wordSize) {
        this.wordSize = wordSize;
        return this;
    }
    public String getWordSize() {
        return this.wordSize;
    }

    public ListDocumentRetrieveRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
