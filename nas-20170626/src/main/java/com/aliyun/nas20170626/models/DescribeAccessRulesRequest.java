// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeAccessRulesRequest extends TeaModel {
    @NameInMap("AccessGroupName")
    public String accessGroupName;

    @NameInMap("AccessRuleId")
    public String accessRuleId;

    @NameInMap("SourceCidrIp")
    public String sourceCidrIp;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("FileSystemType")
    public String fileSystemType;

    @NameInMap("SourceCidrIpFilter")
    public String sourceCidrIpFilter;

    public static DescribeAccessRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessRulesRequest self = new DescribeAccessRulesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAccessRulesRequest setAccessGroupName(String accessGroupName) {
        this.accessGroupName = accessGroupName;
        return this;
    }
    public String getAccessGroupName() {
        return this.accessGroupName;
    }

    public DescribeAccessRulesRequest setAccessRuleId(String accessRuleId) {
        this.accessRuleId = accessRuleId;
        return this;
    }
    public String getAccessRuleId() {
        return this.accessRuleId;
    }

    public DescribeAccessRulesRequest setSourceCidrIp(String sourceCidrIp) {
        this.sourceCidrIp = sourceCidrIp;
        return this;
    }
    public String getSourceCidrIp() {
        return this.sourceCidrIp;
    }

    public DescribeAccessRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAccessRulesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAccessRulesRequest setFileSystemType(String fileSystemType) {
        this.fileSystemType = fileSystemType;
        return this;
    }
    public String getFileSystemType() {
        return this.fileSystemType;
    }

    public DescribeAccessRulesRequest setSourceCidrIpFilter(String sourceCidrIpFilter) {
        this.sourceCidrIpFilter = sourceCidrIpFilter;
        return this;
    }
    public String getSourceCidrIpFilter() {
        return this.sourceCidrIpFilter;
    }

}
