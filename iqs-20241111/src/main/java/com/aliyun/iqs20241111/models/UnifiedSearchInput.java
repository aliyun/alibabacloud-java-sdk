// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class UnifiedSearchInput extends TeaModel {
    /**
     * <p>The advanced search parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;numResults&quot;:&quot;10&quot;}</p>
     */
    @NameInMap("advancedParams")
    public java.util.Map<String, ?> advancedParams;

    /**
     * <p>The query category. If specified, only search results from sites of the corresponding category are returned. Separate multiple categories with commas.</p>
     * 
     * <strong>example:</strong>
     * <p>medical</p>
     */
    @NameInMap("category")
    public String category;

    /**
     * <p>The options for controlling the returned content.</p>
     */
    @NameInMap("contents")
    public RequestContents contents;

    /**
     * <p>The engine type. Default value: Generic. Valid values: Generic, GenericAdvanced. GenericAdvanced is billed separately and returns more records.</p>
     * 
     * <strong>example:</strong>
     * <p>Generic</p>
     */
    @NameInMap("engineType")
    public String engineType;

    /**
     * <p><strong>[Deprecated]</strong> The location parameter. Use locationInfo to specify a city or IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>60.194.214.228</p>
     */
    @NameInMap("location")
    public String location;

    /**
     * <p>The location information, used for scenario-based searches such as weather.</p>
     */
    @NameInMap("locationInfo")
    public LocationInfo locationInfo;

    /**
     * <p>The query content. The length limit is 1 to 100 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>Apsara Conference</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>The publication time range for the content.</p>
     * 
     * <strong>example:</strong>
     * <p>NoLimit</p>
     */
    @NameInMap("timeRange")
    public String timeRange;

    public static UnifiedSearchInput build(java.util.Map<String, ?> map) throws Exception {
        UnifiedSearchInput self = new UnifiedSearchInput();
        return TeaModel.build(map, self);
    }

    public UnifiedSearchInput setAdvancedParams(java.util.Map<String, ?> advancedParams) {
        this.advancedParams = advancedParams;
        return this;
    }
    public java.util.Map<String, ?> getAdvancedParams() {
        return this.advancedParams;
    }

    public UnifiedSearchInput setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public UnifiedSearchInput setContents(RequestContents contents) {
        this.contents = contents;
        return this;
    }
    public RequestContents getContents() {
        return this.contents;
    }

    public UnifiedSearchInput setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }
    public String getEngineType() {
        return this.engineType;
    }

    public UnifiedSearchInput setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public UnifiedSearchInput setLocationInfo(LocationInfo locationInfo) {
        this.locationInfo = locationInfo;
        return this;
    }
    public LocationInfo getLocationInfo() {
        return this.locationInfo;
    }

    public UnifiedSearchInput setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public UnifiedSearchInput setTimeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public String getTimeRange() {
        return this.timeRange;
    }

}
