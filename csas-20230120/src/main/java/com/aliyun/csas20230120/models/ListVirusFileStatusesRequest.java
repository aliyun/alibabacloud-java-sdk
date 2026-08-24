// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListVirusFileStatusesRequest extends TeaModel {
    /**
     * <p>The page number of the current page in paging. Valid values: 1 to 10000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>The department name. Matches any level of the organizational structure to which the user belongs. Specify the department name itself without the full path of the organizational structure. The value can contain Chinese characters, uppercase and lowercase letters, digits, spaces, periods (.), commas (,), forward slashes (/), at signs (@), hyphens (-), and underscores (_).</p>
     * 
     * <strong>example:</strong>
     * <p>R&amp;D Department</p>
     */
    @NameInMap("Department")
    public String department;

    /**
     * <p>The unique identifier of the user terminal device. Exact match. The value can be up to 64 characters in length. You can obtain the value from the following operation:</p>
     * <ul>
     * <li><a href="~~ListUserDevices~~">ListUserDevices</a>: Lists user terminal devices.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>36efa42d-2c32-c4dc-e3fc-8541e33a****</p>
     */
    @NameInMap("DevTag")
    public String devTag;

    /**
     * <p>The operating system type of the user terminal device. Valid values:</p>
     * <ul>
     * <li><strong>windows</strong>: Windows.</li>
     * <li><strong>macOS</strong>: macOS.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>windows</p>
     */
    @NameInMap("DevType")
    public String devType;

    /**
     * <p>The end time for filtering by virus file discovery time. The value is a UNIX timestamp in seconds. This parameter must be specified together with StartTime and must be later than StartTime.</p>
     * 
     * <strong>example:</strong>
     * <p>1786377600</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The MD5 value of the virus file. Fuzzy match is supported. The value can be up to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>d41d8cd98f00b204e9800998ecf8427e</p>
     */
    @NameInMap("FileMd5")
    public String fileMd5;

    /**
     * <p>Filters by disposition status. If this parameter is not specified, no filtering by disposition status is applied. Valid values:</p>
     * <ul>
     * <li><strong>Pending</strong>: Pending disposition.</li>
     * <li><strong>Processed</strong>: Disposed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Pending</p>
     */
    @NameInMap("FileProcessStatus")
    public String fileProcessStatus;

    /**
     * <p>The hostname of the user terminal device. Fuzzy match is supported. The value can be up to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>DESKTOP-8A3F</p>
     */
    @NameInMap("Hostname")
    public String hostname;

    /**
     * <p>Filters by disposition action. Duplicate values are not allowed. If this parameter is not specified, no filtering by disposition action is applied.</p>
     */
    @NameInMap("Operations")
    public java.util.List<String> operations;

    /**
     * <p>The number of entries per page in paging. Valid values: 1 to 1000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>Filters by risk level. Duplicate values are not allowed. If this parameter is not specified, no filtering by risk level is applied.</p>
     */
    @NameInMap("RiskLevels")
    public java.util.List<String> riskLevels;

    /**
     * <p>The user ID. Exact match. The value can be up to 128 characters in length. You can obtain the value from the following operations:</p>
     * <ul>
     * <li><a href="~~ListUserDevices~~">ListUserDevices</a>: Lists user terminal devices.</li>
     * <li><a href="~~GetUserDevice~~">GetUserDevice</a>: Queries user terminal device details.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
     */
    @NameInMap("SaseUserId")
    public String saseUserId;

    /**
     * <p>The ID of the virus scan task that detected the virus file. This parameter is used to filter detection results of a specified task. You can obtain the value from the following operations:</p>
     * <ul>
     * <li><a href="~~ListVirusScanTasks~~">ListVirusScanTasks</a>: Lists virus scan tasks.</li>
     * <li><a href="~~CreateVirusScanTask~~">CreateVirusScanTask</a>: Creates a virus scan task.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>v1:1024772</p>
     */
    @NameInMap("ScanTaskId")
    public String scanTaskId;

    /**
     * <p>The start time for filtering by virus file discovery time. The value is a UNIX timestamp in seconds. This parameter must be specified together with EndTime and must be earlier than EndTime.</p>
     * 
     * <strong>example:</strong>
     * <p>1786291200</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The username. Fuzzy match is supported. The value can be up to 128 characters in length and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), asterisks (*), hyphens (-), at signs (@), spaces, middle dots (·), and parentheses.</p>
     * 
     * <strong>example:</strong>
     * <p>John Smith</p>
     */
    @NameInMap("Username")
    public String username;

    /**
     * <p>Filters by virus type. Duplicate values are not allowed. If this parameter is not specified, no filtering by virus type is applied.</p>
     */
    @NameInMap("VirusTypes")
    public java.util.List<String> virusTypes;

    public static ListVirusFileStatusesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVirusFileStatusesRequest self = new ListVirusFileStatusesRequest();
        return TeaModel.build(map, self);
    }

    public ListVirusFileStatusesRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListVirusFileStatusesRequest setDepartment(String department) {
        this.department = department;
        return this;
    }
    public String getDepartment() {
        return this.department;
    }

    public ListVirusFileStatusesRequest setDevTag(String devTag) {
        this.devTag = devTag;
        return this;
    }
    public String getDevTag() {
        return this.devTag;
    }

    public ListVirusFileStatusesRequest setDevType(String devType) {
        this.devType = devType;
        return this;
    }
    public String getDevType() {
        return this.devType;
    }

    public ListVirusFileStatusesRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListVirusFileStatusesRequest setFileMd5(String fileMd5) {
        this.fileMd5 = fileMd5;
        return this;
    }
    public String getFileMd5() {
        return this.fileMd5;
    }

    public ListVirusFileStatusesRequest setFileProcessStatus(String fileProcessStatus) {
        this.fileProcessStatus = fileProcessStatus;
        return this;
    }
    public String getFileProcessStatus() {
        return this.fileProcessStatus;
    }

    public ListVirusFileStatusesRequest setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public ListVirusFileStatusesRequest setOperations(java.util.List<String> operations) {
        this.operations = operations;
        return this;
    }
    public java.util.List<String> getOperations() {
        return this.operations;
    }

    public ListVirusFileStatusesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListVirusFileStatusesRequest setRiskLevels(java.util.List<String> riskLevels) {
        this.riskLevels = riskLevels;
        return this;
    }
    public java.util.List<String> getRiskLevels() {
        return this.riskLevels;
    }

    public ListVirusFileStatusesRequest setSaseUserId(String saseUserId) {
        this.saseUserId = saseUserId;
        return this;
    }
    public String getSaseUserId() {
        return this.saseUserId;
    }

    public ListVirusFileStatusesRequest setScanTaskId(String scanTaskId) {
        this.scanTaskId = scanTaskId;
        return this;
    }
    public String getScanTaskId() {
        return this.scanTaskId;
    }

    public ListVirusFileStatusesRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListVirusFileStatusesRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public ListVirusFileStatusesRequest setVirusTypes(java.util.List<String> virusTypes) {
        this.virusTypes = virusTypes;
        return this;
    }
    public java.util.List<String> getVirusTypes() {
        return this.virusTypes;
    }

}
