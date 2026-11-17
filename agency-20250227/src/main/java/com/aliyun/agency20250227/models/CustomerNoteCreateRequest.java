// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20250227.models;

import com.aliyun.tea.*;

public class CustomerNoteCreateRequest extends TeaModel {
    /**
     * <p>The contact information.</p>
     * 
     * <strong>example:</strong>
     * <p>13833333333</p>
     */
    @NameInMap("ContactInformation")
    public String contactInformation;

    /**
     * <p>The contact name.</p>
     * 
     * <strong>example:</strong>
     * <p>Zhang San</p>
     */
    @NameInMap("ContactName")
    public String contactName;

    /**
     * <p>The customer name.</p>
     * 
     * <strong>example:</strong>
     * <p>XXXX Co., Ltd</p>
     */
    @NameInMap("CustomerName")
    public String customerName;

    /**
     * <p>The customer UID.</p>
     * 
     * <strong>example:</strong>
     * <p>1647796581073291</p>
     */
    @NameInMap("CustomerUid")
    public String customerUid;

    /**
     * <p>The note content.</p>
     * 
     * <strong>example:</strong>
     * <p>Routine customer visit to discuss the agent implementation plan for the customer</p>
     */
    @NameInMap("NoteContent")
    public String noteContent;

    /**
     * <p>The contact time (timestamp, in milliseconds).</p>
     * 
     * <strong>example:</strong>
     * <p>1784266662000</p>
     */
    @NameInMap("TouchDate")
    public Long touchDate;

    public static CustomerNoteCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        CustomerNoteCreateRequest self = new CustomerNoteCreateRequest();
        return TeaModel.build(map, self);
    }

    public CustomerNoteCreateRequest setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
        return this;
    }
    public String getContactInformation() {
        return this.contactInformation;
    }

    public CustomerNoteCreateRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public CustomerNoteCreateRequest setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }
    public String getCustomerName() {
        return this.customerName;
    }

    public CustomerNoteCreateRequest setCustomerUid(String customerUid) {
        this.customerUid = customerUid;
        return this;
    }
    public String getCustomerUid() {
        return this.customerUid;
    }

    public CustomerNoteCreateRequest setNoteContent(String noteContent) {
        this.noteContent = noteContent;
        return this;
    }
    public String getNoteContent() {
        return this.noteContent;
    }

    public CustomerNoteCreateRequest setTouchDate(Long touchDate) {
        this.touchDate = touchDate;
        return this;
    }
    public Long getTouchDate() {
        return this.touchDate;
    }

}
