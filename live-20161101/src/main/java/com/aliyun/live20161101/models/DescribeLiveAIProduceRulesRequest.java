// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveAIProduceRulesRequest extends TeaModel {
    /**
     * <p>The name of the application to which the live stream belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>AppName</p>
     */
    @NameInMap("App")
    public String app;

    /**
     * <p>The main streaming domain.</p>
     * 
     * <strong>example:</strong>
     * <p>demo.aliyundoc.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Valid values: [1,100].</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page. Valid values: [1,100].</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the subtitle rule.</p>
     * 
     * <strong>example:</strong>
     * <p>445409ec-7eaa-461d-8f29-4bec****</p>
     */
    @NameInMap("RulesId")
    public String rulesId;

    /**
     * <p>The suffix of the subtitle rule.</p>
     * <blockquote>
     * <p>Set the value to the name of the subtitle template.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>sub01</p>
     */
    @NameInMap("SuffixName")
    public String suffixName;

    public static DescribeLiveAIProduceRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveAIProduceRulesRequest self = new DescribeLiveAIProduceRulesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveAIProduceRulesRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public DescribeLiveAIProduceRulesRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeLiveAIProduceRulesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveAIProduceRulesRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLiveAIProduceRulesRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeLiveAIProduceRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLiveAIProduceRulesRequest setRulesId(String rulesId) {
        this.rulesId = rulesId;
        return this;
    }
    public String getRulesId() {
        return this.rulesId;
    }

    public DescribeLiveAIProduceRulesRequest setSuffixName(String suffixName) {
        this.suffixName = suffixName;
        return this;
    }
    public String getSuffixName() {
        return this.suffixName;
    }

}
