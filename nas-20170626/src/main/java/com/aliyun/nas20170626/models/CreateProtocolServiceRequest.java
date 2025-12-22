// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateProtocolServiceRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
     * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How do I ensure the idempotence?</a></p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the protocol service. The name of the protocol service appears in the console.</p>
     * <p>Limits:</p>
     * <ul>
     * <li>The description must be 2 to 128 characters in length.</li>
     * <li>The description must start with a letter and cannot start with <code>http://</code> or <code>https://</code>.</li>
     * <li>The description can contain letters, digits, colons (:), underscores (_), and hyphens (-).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to perform a dry run.</p>
     * <p>The dry run checks parameter validity and prerequisites. The dry run does not create a protocol service or incur fees.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: performs only a dry run and does not create the protocol service. The system checks the request format, service limits, prerequisites, and whether the required parameters are specified. If the request fails the dry run, an error message is returned. If the request passes the dry run, the HTTP status code 200 is returned. No value is returned for the ProtocolServiceId parameter.</li>
     * <li>false (default): performs a dry run and sends the request. If the request passes the dry run, a protocol service is created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the file system.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cpfs-123****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The specification of the protocol service.</p>
     * <p>Set the value to General (default).</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>CL2</li>
     * <li>General</li>
     * <li>CL1</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>General</p>
     */
    @NameInMap("ProtocolSpec")
    public String protocolSpec;

    /**
     * <p>The protocol type of the protocol service.</p>
     * <p>Valid value: NFS (default). Only NFSv3 is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NFS</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>The throughput of the protocol service.</p>
     * <p>Unit: MB/s.</p>
     * 
     * <strong>example:</strong>
     * <p>8000</p>
     */
    @NameInMap("Throughput")
    public Integer throughput;

    /**
     * <p>The vSwitch ID of the protocol service.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-123****</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The virtual private cloud (VPC) ID of the protocol service. The VPC ID of the protocol service must be the same as the VPC ID of the file system.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-123****</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static CreateProtocolServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProtocolServiceRequest self = new CreateProtocolServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateProtocolServiceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateProtocolServiceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateProtocolServiceRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateProtocolServiceRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public CreateProtocolServiceRequest setProtocolSpec(String protocolSpec) {
        this.protocolSpec = protocolSpec;
        return this;
    }
    public String getProtocolSpec() {
        return this.protocolSpec;
    }

    public CreateProtocolServiceRequest setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public CreateProtocolServiceRequest setThroughput(Integer throughput) {
        this.throughput = throughput;
        return this;
    }
    public Integer getThroughput() {
        return this.throughput;
    }

    public CreateProtocolServiceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateProtocolServiceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
