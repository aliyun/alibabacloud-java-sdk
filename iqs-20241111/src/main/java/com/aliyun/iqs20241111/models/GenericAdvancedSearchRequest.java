// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class GenericAdvancedSearchRequest extends TeaModel {
    /**
     * <p>The industry. If you specify this parameter, only website content specific to the specified industry is recalled. Separate multiple industries with commas.</p>
     * 
     * <strong>example:</strong>
     * <p>medical</p>
     */
    @NameInMap("industry")
    public String industry;

    /**
     * <p>The search query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>iPhone</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>The session ID for multi-turn interactions.</p>
     * 
     * <strong>example:</strong>
     * <p>job-4065bee3-e7aa-49fc-aad2-a8e3a7fd6acd</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <p>The relative query range for the web page publication time. Valid values: OneDay, OneWeek, OneMonth, OneYear, and NoLimit. A value of NoLimit indicates that no time limit is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>OneWeek</p>
     */
    @NameInMap("timeRange")
    public String timeRange;

    public static GenericAdvancedSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        GenericAdvancedSearchRequest self = new GenericAdvancedSearchRequest();
        return TeaModel.build(map, self);
    }

    public GenericAdvancedSearchRequest setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public GenericAdvancedSearchRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public GenericAdvancedSearchRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public GenericAdvancedSearchRequest setTimeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public String getTimeRange() {
        return this.timeRange;
    }

}
