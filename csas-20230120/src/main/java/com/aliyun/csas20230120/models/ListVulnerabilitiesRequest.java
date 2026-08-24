// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListVulnerabilitiesRequest extends TeaModel {
    /**
     * <p>The page number of the current page in a paged query with paging. Valid values: 1 to 10000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>The department name. Matches any level of department in the organizational structure to which the user belongs. Specify the department name itself without the full path of the organizational structure.</p>
     * 
     * <strong>example:</strong>
     * <p>R&amp;D Department</p>
     */
    @NameInMap("Department")
    public String department;

    /**
     * <p>The unique identifier of the user endpoint device. Exact match. The value can be up to 64 characters in length. Valid values are obtained from:</p>
     * <ul>
     * <li><a href="~~ListUserDevices~~">ListUserDevices</a>: lists user endpoint devices.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>36efa42d-2c32-c4dc-e3fc-8541e33a****</p>
     */
    @NameInMap("DevTag")
    public String devTag;

    /**
     * <p>The operating system type of the user endpoint device. Valid values:</p>
     * <ul>
     * <li><strong>windows</strong>: Windows. Currently, vulnerability scanning supports only Windows.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>windows</p>
     */
    @NameInMap("DevType")
    public String devType;

    /**
     * <p>The hostname of the user endpoint device. Fuzzy match is supported. The value can be up to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>DESKTOP-8A3F</p>
     */
    @NameInMap("Hostname")
    public String hostname;

    /**
     * <p>The number of entries per page. Settings for paged query with paging. Valid values: 1 to 1000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The user ID. Exact match. Valid values are obtained from:</p>
     * <ul>
     * <li><a href="~~ListUserDevices~~">ListUserDevices</a>: lists user endpoint devices.</li>
     * <li><a href="~~GetUserDevice~~">GetUserDevice</a>: queries the details of a user endpoint device.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
     */
    @NameInMap("SaseUserId")
    public String saseUserId;

    /**
     * <p>The ID of the vulnerability scanning node that detected the vulnerability. Used to filter detection results of a specified node. Valid values are obtained from:</p>
     * <ul>
     * <li><a href="~~ListVulScanTasks~~">ListVulScanTasks</a>: lists vulnerability scanning nodes.</li>
     * <li><a href="~~CreateVulScanTask~~">CreateVulScanTask</a>: creates a vulnerability scanning node.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vul-scan-task-4d7b1e9a6c38****</p>
     */
    @NameInMap("ScanTaskId")
    public String scanTaskId;

    /**
     * <p>The vulnerability title. Fuzzy match is supported. Matches both Chinese and English titles.</p>
     * 
     * <strong>example:</strong>
     * <p>Cumulative Update</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The patch IDs used for filtering. A maximum of 100 IDs can be specified. Duplicate values are not allowed.</p>
     */
    @NameInMap("UpdateIds")
    public java.util.List<String> updateIds;

    /**
     * <p>The username. Fuzzy match is supported. The value can be up to 128 characters in length and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), asterisks (*), hyphens (-), at signs (@), spaces, middle dots (·), and parentheses.</p>
     * 
     * <strong>example:</strong>
     * <p>John Smith</p>
     */
    @NameInMap("Username")
    public String username;

    /**
     * <p>The vulnerability risk level used for filtering. Valid values:</p>
     * <ul>
     * <li><strong>High</strong>: high risk.</li>
     * <li><strong>Mid</strong>: medium risk.</li>
     * <li><strong>Low</strong>: low risk.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>High</p>
     */
    @NameInMap("VulLevel")
    public String vulLevel;

    /**
     * <p>The vulnerability type used for filtering. Valid values:</p>
     * <ul>
     * <li><strong>windows</strong>: Windows system vulnerability.</li>
     * <li><strong>ai_agent</strong>: AI Agent vulnerability.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>windows</p>
     */
    @NameInMap("VulType")
    public String vulType;

    public static ListVulnerabilitiesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVulnerabilitiesRequest self = new ListVulnerabilitiesRequest();
        return TeaModel.build(map, self);
    }

    public ListVulnerabilitiesRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListVulnerabilitiesRequest setDepartment(String department) {
        this.department = department;
        return this;
    }
    public String getDepartment() {
        return this.department;
    }

    public ListVulnerabilitiesRequest setDevTag(String devTag) {
        this.devTag = devTag;
        return this;
    }
    public String getDevTag() {
        return this.devTag;
    }

    public ListVulnerabilitiesRequest setDevType(String devType) {
        this.devType = devType;
        return this;
    }
    public String getDevType() {
        return this.devType;
    }

    public ListVulnerabilitiesRequest setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public ListVulnerabilitiesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListVulnerabilitiesRequest setSaseUserId(String saseUserId) {
        this.saseUserId = saseUserId;
        return this;
    }
    public String getSaseUserId() {
        return this.saseUserId;
    }

    public ListVulnerabilitiesRequest setScanTaskId(String scanTaskId) {
        this.scanTaskId = scanTaskId;
        return this;
    }
    public String getScanTaskId() {
        return this.scanTaskId;
    }

    public ListVulnerabilitiesRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public ListVulnerabilitiesRequest setUpdateIds(java.util.List<String> updateIds) {
        this.updateIds = updateIds;
        return this;
    }
    public java.util.List<String> getUpdateIds() {
        return this.updateIds;
    }

    public ListVulnerabilitiesRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public ListVulnerabilitiesRequest setVulLevel(String vulLevel) {
        this.vulLevel = vulLevel;
        return this;
    }
    public String getVulLevel() {
        return this.vulLevel;
    }

    public ListVulnerabilitiesRequest setVulType(String vulType) {
        this.vulType = vulType;
        return this;
    }
    public String getVulType() {
        return this.vulType;
    }

}
