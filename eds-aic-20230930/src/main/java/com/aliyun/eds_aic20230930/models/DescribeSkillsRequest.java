// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeSkillsRequest extends TeaModel {
    /**
     * <p>The keyword in the skill name or skill description.</p>
     * 
     * <strong>example:</strong>
     * <p>weather</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The language type. The skill description is returned in this language.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>en: English.</li>
     * <li>zh-CN: Chinese.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The skill ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sk-051j4pbwxzgol****</p>
     */
    @NameInMap("SkillId")
    public String skillId;

    /**
     * <p>The status filter.</p>
     * 
     * <strong>example:</strong>
     * <p>UPLOADED</p>
     */
    @NameInMap("StatusFilter")
    public String statusFilter;

    /**
     * <p>The skill type.</p>
     * 
     * <strong>example:</strong>
     * <p>System</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeSkillsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSkillsRequest self = new DescribeSkillsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSkillsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeSkillsRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public DescribeSkillsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSkillsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSkillsRequest setSkillId(String skillId) {
        this.skillId = skillId;
        return this;
    }
    public String getSkillId() {
        return this.skillId;
    }

    public DescribeSkillsRequest setStatusFilter(String statusFilter) {
        this.statusFilter = statusFilter;
        return this;
    }
    public String getStatusFilter() {
        return this.statusFilter;
    }

    public DescribeSkillsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
