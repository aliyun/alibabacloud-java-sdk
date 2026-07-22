// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallAccessDetailRequest extends TeaModel {
    /**
     * <p>The IP address of the local asset. You must specify at least one of AssetIP and Port. If both are left empty, the API returns a 400 error.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("AssetIP")
    public String assetIP;

    /**
     * <p>The page number in a paging query. Settings this parameter to specify the current page for paging.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>The traffic direction. Valid values:</p>
     * <ul>
     * <li><strong>in</strong>: inbound.</li>
     * <li><strong>out</strong>: outbound.</li>
     * </ul>
     * <blockquote>
     * <p>If this parameter is not specified in Settings, traffic in all directions is queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>in</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The end time of the query. The value is a UNIX timestamp. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1729042555</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The protocol type. Valid values:</p>
     * <ul>
     * <li><strong>tcp</strong>: TCP protocol.</li>
     * <li><strong>udp</strong>: UDP protocol.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>tcp</p>
     */
    @NameInMap("IPProtocol")
    public String IPProtocol;

    /**
     * <p>The language type. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li><strong>asc</strong>: ascending order.</li>
     * <li><strong>desc</strong> (default): descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The number of entries per page in a paging query.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The source IP address of the peer.</p>
     * 
     * <strong>example:</strong>
     * <p>10.125.1.XX</p>
     */
    @NameInMap("PeerAssetIP")
    public String peerAssetIP;

    /**
     * <p>The instance ID of the peer asset.</p>
     * 
     * <strong>example:</strong>
     * <p>i-123451</p>
     */
    @NameInMap("PeerAssetInstanceId")
    public String peerAssetInstanceId;

    /**
     * <p>The instance name of the peer asset.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs22</p>
     */
    @NameInMap("PeerAssetInstanceName")
    public String peerAssetInstanceName;

    /**
     * <p>The instance ID of the peer VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-90rq0anm6t8vbwbo****</p>
     */
    @NameInMap("PeerVpcId")
    public String peerVpcId;

    /**
     * <p>The port number. You must specify at least one of AssetIP and Port. If both are left empty, the API returns a 400 error.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>The risk assessment level.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("RiskLevel")
    public String riskLevel;

    /**
     * <p>The sort field. Valid values:</p>
     * <ul>
     * <li><p><strong>InBytes</strong></p>
     * </li>
     * <li><p><strong>OutBytes</strong></p>
     * </li>
     * <li><p><strong>TotalBytes</strong></p>
     * </li>
     * <li><p><strong>InPackets</strong></p>
     * </li>
     * <li><p><strong>OutPackets</strong></p>
     * </li>
     * <li><p><strong>SessionCount</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InBytes</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>The start time of the query. The value is a UNIX timestamp. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1655778046</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The VPC-connected instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-2ze4xj5kmb5udb****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static DescribeVpcFirewallAccessDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallAccessDetailRequest self = new DescribeVpcFirewallAccessDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallAccessDetailRequest setAssetIP(String assetIP) {
        this.assetIP = assetIP;
        return this;
    }
    public String getAssetIP() {
        return this.assetIP;
    }

    public DescribeVpcFirewallAccessDetailRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeVpcFirewallAccessDetailRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public DescribeVpcFirewallAccessDetailRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVpcFirewallAccessDetailRequest setIPProtocol(String IPProtocol) {
        this.IPProtocol = IPProtocol;
        return this;
    }
    public String getIPProtocol() {
        return this.IPProtocol;
    }

    public DescribeVpcFirewallAccessDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeVpcFirewallAccessDetailRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeVpcFirewallAccessDetailRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeVpcFirewallAccessDetailRequest setPeerAssetIP(String peerAssetIP) {
        this.peerAssetIP = peerAssetIP;
        return this;
    }
    public String getPeerAssetIP() {
        return this.peerAssetIP;
    }

    public DescribeVpcFirewallAccessDetailRequest setPeerAssetInstanceId(String peerAssetInstanceId) {
        this.peerAssetInstanceId = peerAssetInstanceId;
        return this;
    }
    public String getPeerAssetInstanceId() {
        return this.peerAssetInstanceId;
    }

    public DescribeVpcFirewallAccessDetailRequest setPeerAssetInstanceName(String peerAssetInstanceName) {
        this.peerAssetInstanceName = peerAssetInstanceName;
        return this;
    }
    public String getPeerAssetInstanceName() {
        return this.peerAssetInstanceName;
    }

    public DescribeVpcFirewallAccessDetailRequest setPeerVpcId(String peerVpcId) {
        this.peerVpcId = peerVpcId;
        return this;
    }
    public String getPeerVpcId() {
        return this.peerVpcId;
    }

    public DescribeVpcFirewallAccessDetailRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public DescribeVpcFirewallAccessDetailRequest setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public String getRiskLevel() {
        return this.riskLevel;
    }

    public DescribeVpcFirewallAccessDetailRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public DescribeVpcFirewallAccessDetailRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeVpcFirewallAccessDetailRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
